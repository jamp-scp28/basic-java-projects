package childClass;

import baseClass.person;

public class coordinator extends person {
   Integer salary;

    public coordinator(String name, Integer age, Integer salary) {
        super(name, age);
        this.salary = salary;
    }

    public String getSalary(){
        return "Coordinator salary is: " + this.salary;
    }
}
