import java.util.Scanner;

/*Paso 1: Caso Colegio: escribir un programa para un
colegio que contenga estudiantes y administrativos
haciendo uso de programación orientada a objetos.

Las características comunes que se almacenan para ambos
son el número de ID, nombre completo, edad, dirección y
teléfono.

** Estas características se pasan por parámetro en el
momento de crear los objetos.

** Los estudiantes tienen además los atributos de año escolar,
valor de la pensión.

** Los administrativos tienen además los atributos de área de
trabajo y tipo de contrato.

Los 2 tipos deben tener (aparte de los constructores) un
método imprimir() que devuelve el valor de todos los

atributos en una cadena de caracteres.
Implementar además los métodos horario() y transporte(),
donde se le pasa el tipo de usuario
(1=estudiantes, 2 =administrativos) y debe mostrar un
mensaje especificando el tipo de usuario, que horario tiene
y medio de transporte*/

public class main {

    public static void main(String args[]){
        //Create instance of menu
        AppMenu appMenu = new AppMenu();
        //Create instance of student
        Student student = new Student();
        //Create instance of administrative
        Administrative administrative = new Administrative();
        //Create instance of Scanner
        Scanner input = new Scanner(System.in);
        //Create schedule transport
        Methods methods = new Methods();

        //define variables
        String name = "";
        Integer selectedID = 0;
        Boolean go = true;
        Integer typeChoose;
        Integer menuOption;
        //Schedule and Transport Method

        while(go){
            go = false;
            appMenu.showOptions();
            menuOption = input.nextInt();
            switch (menuOption){
                case 1:
                    //id
                    System.out.println("Please enter student id: ");
                    student.setId(input.nextInt());
                    //name
                    System.out.println("Please enter student name: ");
                    student.setName(input.next());
                    //age
                    System.out.println("Please enter student age: ");
                    student.setAge(input.nextInt());
                    //address
                    System.out.println("Please enter student address: ");
                    student.setAddress(input.next());
                    //phone
                    System.out.println("Please enter student phone: ");
                    student.setPhone(input.nextInt());
                    //year
                    System.out.println("Please enter student year: ");
                    student.setYear(input.nextInt());
                    //fees
                    System.out.println("Please enter student Fees: ");
                    student.setFees(input.nextDouble());
                    //Save to DB
                    methods.saveStudent(student);
                    System.out.println("STUDENT ADDED TO DB, PRINTING DATA: ");
                    System.out.println("==============================================");
                    System.out.println(student.printStudent());
                    System.out.println("==============================================");
                    go = true;
                    break;
                case 2:
                    //id
                    System.out.println("Please enter administrative id: ");
                    administrative.setId(input.nextInt());
                    //name
                    System.out.println("Please enter administrative name: ");
                    administrative.setName(input.next());
                    //age
                    System.out.println("Please enter administrative age: ");
                    administrative.setAge(input.nextInt());
                    //address
                    System.out.println("Please enter administrative address: ");
                    administrative.setAddress(input.next());
                    //phone
                    System.out.println("Please enter administrative phone: ");
                    administrative.setPhone(input.nextInt());
                    //year
                    System.out.println("Please enter administrative workarea: ");
                    administrative.setWorkArea(input.next());
                    //fees
                    System.out.println("Please enter administrative contract: ");
                    administrative.setContract(input.next());
                    //Save to DB
                    methods.saveAdministrative(administrative);
                    System.out.println("ADMINISTRATIVE ADDED TO DB, PRINTING DATA: ");
                    System.out.println("==============================================");
                    System.out.println(administrative.printAdministrative());
                    System.out.println("==============================================");
                    go = true;
                    break;
                case 3:
                    System.out.println("Please select:");
                    System.out.println("'1' for students, \n '2  for administrative ");
                    System.out.println("PRINTING SCHEDULE AND TRANSPORT DATA: ");
                    System.out.println("==============================================");
                    String s = methods.scheduleAndTransport(input.nextInt());
                    System.out.println(s);
                    System.out.println("==============================================");
                case 4:
                    System.out.println("Enter ID: ");
                    selectedID = input.nextInt();
                    System.out.println("PRINTING STUDENT DATA: ");
                    System.out.println("==============================================");
                    String st = methods.printStudentInfo(selectedID);
                    System.out.println(st);
                    System.out.println("==============================================");
                    go = true;
                    break;
                case 5:
                    System.out.println("Enter ID: ");
                    selectedID = input.nextInt();
                    System.out.println("PRINTING ADMINISTRATIVE DATA: ");
                    System.out.println("==============================================");
                    String ad = methods.printAdministrativeInfo(selectedID);
                    System.out.println(ad);
                    System.out.println("==============================================");
                    go = true;
                    break;
                case 6:
                    System.out.print("GOOD BYE...");
                    go = false;
                    break;
                default:
                    System.out.print("Select a valid option...");
                    break;
            }
        }
    }
}
