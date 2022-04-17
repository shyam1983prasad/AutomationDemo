package TestNGAnnodation;

/**
 * Created by muthuselvan on 10/11/17.
 */
public class AnnodationProcessing {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String name;
    String city ;
    String state ;




    public AnnodationProcessing() {

    }

    public String getDetail() {
        System.out.println("Annodation processing using annodate values ");
        System.out.println("Name : " +getName());
        System.out.println("Annodation processing using annodate values ");


        if (getName().equals("muthu")) {
            city="Sunnyvayle";

        } else if (getName().equals("revanth")) {
            city="Santa Clara";

        }

        return " Detail : " +name+ " : " +city + " : " +state;
    }





}
