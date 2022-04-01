import childClass.coordinator;
import childClass.student;
import childClass.teacher;

import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main (String args[]){


        Boolean state = true;
        messageMenu msg = new messageMenu();
        Scanner scan = new Scanner(System.in);
        Integer selectedOption;
        String name;
        Integer age;


        while(state){
            state = false;
            msg.printMessage();
            selectedOption = scan.nextInt();
            switch (selectedOption){
                case 1:
                    String accessCard;
                    System.out.println("Please Enter Name");
                    name = scan.next();
                    System.out.println("Please Enter Age");
                    age = scan.nextInt();
                    System.out.println("Please Enter Access Card ID");
                    accessCard = scan.next();
                    student std = new student(name,age,accessCard);
                    System.out.println("\n Printing information...");
                    System.out.println(std.getPersonalInformation());
                    System.out.println(std.getCardId());
                    System.out.println("\n");
                    state = true;
                    break;
                case 2:
                    String subject;
                    System.out.println("Please Enter Name");
                    name = scan.next();
                    System.out.println("Please Enter Age");
                    age = scan.nextInt();
                    System.out.println("Please Enter Subject");
                    subject = scan.next();
                    teacher tch = new teacher(name,age,subject);
                    System.out.println("\n Printing information...");
                    System.out.println(tch.getPersonalInformation());
                    System.out.println(tch.getSubject());
                    System.out.println("\n");
                    state = true;
                    break;
                case 3:
                    Integer salary;
                    System.out.println("Please Enter Name");
                    name = scan.next();
                    System.out.println("Please Enter Age");
                    age = scan.nextInt();
                    System.out.println("Please Enter salary");
                    salary = scan.nextInt();
                    coordinator ctr = new coordinator(name,age,salary);
                    System.out.println("\n Printing information...");
                    System.out.println(ctr.getPersonalInformation());
                    System.out.println(ctr.getSalary());
                    System.out.println("\n");
                    state = true;
                case 4:
                    System.out.println("Good Bye...");
                    state = false;
                    break;
                default:
                    System.out.println("Select a valid option from menu...");
                    state = true;
                    break;
            }
        }
    }
}
class messageMenu {
    public void printMessage(){
        System.out.println("Please Select an Option: ");
        System.out.println("1. for student");
        System.out.println("2. for teacher");
        System.out.println("3. for coordinator");
        System.out.println("4. for exit");
    }
}