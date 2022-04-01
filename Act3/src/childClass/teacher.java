package childClass;

import baseClass.person;

public class teacher extends person {
    String subject;
    public teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject(){
        return "Teacher is responsible for class: "+ this.subject;
    }
}
