package childClass;

import baseClass.person;

public class student extends person {
    String cardId;

    public student(String name, Integer age, String cardId) {
        super(name, age);
        this.cardId = cardId;
    }

    public String getCardId(){
        return "Student's cardID is: " + this.cardId;
    }
}
