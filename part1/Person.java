package Fourth_Assignment.part1;

public class Person {


    private String name;
    private String address;

    public Person() {}
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return "\"" + name +  "( " + address +  " )\"";
    }




}
