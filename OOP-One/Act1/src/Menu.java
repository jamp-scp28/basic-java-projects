public class Menu {
    public void showStudents(){
        System.out.println("Seleccione un Estudiante: ");
        int number = 1;
        for(studentGrades.Estudiante std: studentGrades.Estudiante.values()){
            System.out.println("Presione: "+number+" para " +std.toString());
            number += 1;
        }
    }
    public void showSubjects(){
        System.out.println("Seleccione la Clase: ");
        int number2 = 1;
        for (studentGrades.Clases subj:studentGrades.Clases.values()){
            System.out.println("Presione: "+number2+" para " +subj.toString());
            number2 += 1;
        }
    }

    public void showMainOptions(){
        System.out.println("Seleccione una opcion del menu: ");
        System.out.println("1. Para: Registrar notas por clase");
        System.out.println("2. Para: Promedio de Estudiante * Materia");
        System.out.println("3. Para: Promedio General del Estudiante");
        System.out.println("4. Para: Promedio General por Clase");
        System.out.println("5. Para: Salir");
    }

}
