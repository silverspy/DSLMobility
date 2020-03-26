import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestTisseoAPI {

    private static String requestTisseo(String service, String request) {
        String key = "74f87071-9002-4103-82db-57f70e19e2d2";
        String targetURL = "https://api.tisseo.fr/v1/";
        String urlParameters = targetURL + service +
                //journeys
                ".json?" +
                request +
                //"departurePlace=basso cambo&arrivalPlace=françois verdiertoulouse&number=2&displayWording=1&lang=fr"
                "&key=" + key;

        try {

            URL urlForGetRequest = new URL(urlParameters);

            String readLine = null;

            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();

            conection.setRequestMethod("GET");

            conection.setRequestProperty("",""); // set userId its a sample here

            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                BufferedReader in = new BufferedReader(

                        new InputStreamReader(conection.getInputStream()));

                StringBuffer response = new StringBuffer();

                while ((readLine = in.readLine()) != null) {

                    response.append(readLine);

                }
                in.close();

                // print result

                System.out.println("JSON String Result " + response.toString());

                //GetAndPost.POSTRequest(response.toString());
                return response.toString();

            } else {

                System.out.println("GET NOT WORKED");

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return "";
    }

    public static String getItiniraire(String departure, String arrival, String date){
        return requestTisseo("journeys","departurePlace=" + departure + "&arrivalPlace=" + arrival + "+toulouse&firstDepartureDatetime=" + date + "&number=2&displayWording=1&lang=fr");
    }
}

