package baseClass;

public class person {
    String name;
    Integer age;

    public person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getPersonalInformation(){
        return "The person's name is: " + this.name + "\n" + " and the age is: "+ this.age; }

}
