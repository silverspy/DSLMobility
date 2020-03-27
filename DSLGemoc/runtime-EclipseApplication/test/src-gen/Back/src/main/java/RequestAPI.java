public class RequestAPI {
		
		    public static String RequestAPI(String departure, String arrival, String date, String api) {
		        if (api == "google") {
		            return "en cours de dev";
		        } else if (api == "tisseo") {
		            return RequestTisseoAPI.getItiniraire(departure,arrival,date);
		        } else {
		            return "error wrong API";
		        }
		    }
		
		}