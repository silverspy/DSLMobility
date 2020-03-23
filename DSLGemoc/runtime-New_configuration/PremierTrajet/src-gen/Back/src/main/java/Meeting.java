import java.util.ArrayList;

public class Meeting {
    String adress;
    String date;
    String id;
    ArrayList<Guest> GuestList = new ArrayList<>();

    public Meeting(String rdvAdress, String date, String id, String userName, String userAdress){
        this.adress = rdvAdress;
        this.date = date;
        this.id = id;
        addUser(userName, userAdress);
    }

    public void addUser(String name, String adress) {
        GuestList.add(new Guest(name,adress));
    }

    public String toJson(){
        return "{\"adress\": \"" + adress + "\", \"date\": \"" + date + "\", \"id\": \"" + id + "\"}";
    }

    public String getAllGuest() {
        String Jsonlist = "\"meetings\": [";
        for (int i = 0; i < GuestList.size(); i++){
            Jsonlist += GuestList.get(i);
        }
        Jsonlist += "]";
        return Jsonlist;
    }

}