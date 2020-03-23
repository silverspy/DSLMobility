public class Guest {
    private String name;
    private String adress;

    public Guest(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
		//toString method for Guests
        return "{\"name\" : \"" + name +"\"\n\"adress\" : \"" + adress + "\"}";
    }
}
