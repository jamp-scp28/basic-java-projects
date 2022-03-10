/** Paso 1: Caso Universidad: Haciendo uso de la
 programación orientada a objetos realice un programa de
 un sistema de registro de notas de los estudiantes de la
 universidad que brinde las funcionalidades de:

 • registrar la nota de 5 estudiantes en 5 asignaturas
   diferentes
 • Obtenga una nota definitiva de cada asignatura
   para cada estudiante se tienen 3 notas parciales en
   cada asignatura (todas con igualdad de valor)
 • Un promedio general de cada estudiante en todas
   sus asignaturas.
 • Un promedio de la nota definitiva de todos los
   estudiantes por cada asignatura **/


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class mainApp {
    public static void main(String[] args){
        /*INITIALIZE CLASSES*/
        Menu menu = new Menu();
        studentGrades app = new studentGrades();
        Scanner input = new Scanner(System.in);
        /*END*/

        /*DECLARE VARIABLES*/
        boolean again = true;
        int menuSelectedOption;
        int studentSelected;
        int subjectSelected;
        int grade1;
        int grade2;
        int grade3;

        int average;
        double stdGrades;
        double subGrades;
        /*END VARIABLES*/
        
        /* User Introduction *present the options:*/
        while(again) {
            again = false;
            menu.showMainOptions();
            menuSelectedOption = input.nextInt();
            switch (menuSelectedOption){
                //Register grades for students and subjects
                case 1:
                    //Ask User to select a Student from list
                    menu.showStudents();
                    studentSelected = input.nextInt();
                    //Ask User to select a Subject from list
                    menu.showSubjects();
                    subjectSelected = input.nextInt();
                    //Ask User to register a grade per subject
                    System.out.println("Registre nota 1: ");
                    grade1 = input.nextInt();
                    System.out.println("Registre nota 2: ");
                    grade2 = input.nextInt();
                    System.out.println("Registre nota 3: ");
                    grade3 = input.nextInt();
                    //call service
                    app.assignGrade(studentSelected,subjectSelected,grade1,grade2,grade3);
                    //redirect the user to the menu
                    again = true;
                    break;
                //Get average of student per subject
                case 2:
                    //Ask the User to select a student from list
                    menu.showStudents();
                    studentSelected = input.nextInt();
                    //Ask the user to select a subject from list
                    menu.showSubjects();
                    subjectSelected = input.nextInt();
                    // show result
                    app.getGradeSubjectStudent(studentSelected,subjectSelected);
                    //Enter to continue, redirect the user to the menu
                   again = true;
                    break;
                //Get Student average in all subjects
                case 3:
                    //Ask the User to select a student from list
                    menu.showStudents();
                    studentSelected = input.nextInt();
                    // show result
                    app.getAllGradesStudent(studentSelected);
                    //Enter to continue, redirect the user to the menu
                    again = true;
                    break;
                //Get average per subjects of all students
                case 4:
                    //Ask the user to select a subject from list
                    menu.showSubjects();
                    subjectSelected = input.nextInt();
                    // show result
                    app.getAllGradesSubject(subjectSelected);
                    //Enter to continue, redirect the user to the menu
                    again = true;
                    break;
                //Quit
                case 5:
                    System.out.println("====================================");
                    System.out.println("Good bye...");
                    System.out.println("====================================");
                    again = false;
                    break;
                default:
                    System.out.println("Seleccione una opción del menu...");
                    break;
            }
        }
    }
}
