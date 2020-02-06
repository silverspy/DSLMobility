import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import spark.Filter;

import java.util.ArrayList;

import static spark.Spark.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Meeting> meetings = new ArrayList<>();

        // Start embedded server at this port
        port(8080);


        after((Filter) (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        post("/createRDV", (request, response) -> {
            String name = request.queryParams("name").replace(" ", "+");
            String adress = request.queryParams("adress").replace(" ", "+");
            String adressRDV = request.queryParams("adressRDV").replace(" ", "+");
            String dateRDV = request.queryParams("dateRDV").replace(" ", "+");
            meetings.add(new Meeting(adressRDV, dateRDV,"" + meetings.size() + 1 , name, adress));
            response.status(200);
            response.type("application/json");
            String APIresponse = RequestTisseoAPI.getItiniraire(adress, adressRDV, dateRDV);
            return APIresponse;
        });

        post("/listRDV", (request, response) -> {
            response.status(200);
            response.type("application/json");

            String Jsonlist = "{\"meetings\": [";
            for (int i = 0; i < meetings.size(); i++){
                Jsonlist += meetings.get(i).toJson();
            }
            Jsonlist += "]}";
            return Jsonlist;
        });

        post("/joinRDV", (request, response) -> {
            String name = request.queryParams("name").replace(" ", "+");
            String adress = request.queryParams("adress").replace(" ", "+");
            String idRDV = request.queryParams("idRDV").replace(" ", "+");
            //String moyen = request.queryParams("moyen").replace(" ", "+");
            response.status(200);
            response.type("application/json");
            Meeting m = meetings.get(Integer.parseInt(idRDV) - 1);
            m.addUser(name,adress);
            String APIresponse = RequestTisseoAPI.getItiniraire(adress,m.adress, m.date);
            return APIresponse;
        });

    }

}