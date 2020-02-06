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

        meetings.add(new Meeting("adres1","date1", "RDV1","username","adress"));
        System.out.println(meetings.toString());

        after((Filter) (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        post("/createRDV", (request, response) -> {
            String name = request.queryParams("name");
            String adress = request.queryParams("adress");
            String adressRDV = request.queryParams("adressRDV");
            String dateRDV = request.queryParams("dateRDV");
            meetings.add(new Meeting(adressRDV, "" + meetings.size() + 1 , dateRDV, name, adress));
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
            String name = request.queryParams("name");
            String adress = request.queryParams("adress");
            String idRDV = request.queryParams("idRDV");
            //String moyen = request.queryParams("moyen");
            response.status(200);
            response.type("application/json");
            Meeting m = meetings.get(Integer.parseInt(idRDV) - 1);
            m.addUser(name,adress);
            String APIresponse = RequestTisseoAPI.getItiniraire(adress,m.adress, m.adress);
            return APIresponse;
        });

    }

}