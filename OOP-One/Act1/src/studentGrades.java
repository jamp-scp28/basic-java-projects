import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class studentGrades {

    enum Clases {
        CLASE1,
        CLASE2,
        CLASE3,
        CLASE4,
        CLASE5;
    }
    enum Estudiante{
        ESTUDIANTE1,
        ESTUDIANTE2,
        ESTUDIANTE3,
        ESTUDIANTE4,
        ESTUDIANTE5;
    }

    List<Iassing> students = new ArrayList<Iassing>();

    //Add relationship between class, student and grade
    public void assignGrade(int student, int subject, int grade1, int grade2, int grade3){

        Iassing assignation = new Iassing();
        assignation.student = student;
        assignation.subject = subject;
        assignation.grade1 = grade1;
        assignation.grade2 = grade2;
        assignation.grade3 = grade3;

        this.students.add(assignation);
        System.out.println("=================================");
        System.out.println("Notas registradas!");
        System.out.println("=================================");

    }

    //get general grade for subject per student
    public int getGradeSubjectStudent(int student, int subject){
        int average;
        List<Iassing> stds = students.stream().filter(c->c.student==student&& c.subject == subject).collect(Collectors.toList());
        Iassing std = stds.get(0);
        average = ((std.grade1+std.grade2+std.grade3)/3);
        System.out.println("=================================");
        System.out.println("El promedio es: "+average);
        System.out.println("=================================");

        return average;
    }
    //get general grade of student in all subjects
    public double getAllGradesStudent(int student){
        int generalAverage;
        List<Iassing> grades = students.stream().filter(c->c.student == student).collect(Collectors.toList());
        OptionalDouble average = grades.stream().mapToDouble(a -> a.average()).average();
        System.out.println("=================================");
        System.out.println("El promedio general del estudiante es: "+average.getAsDouble());
        System.out.println("=================================");
        return average.getAsDouble();
    }
    //get general grade of all students per subject
    public double getAllGradesSubject(int subject){
        int generalAverage;
        List<Iassing> grades = students.stream().filter(c->c.subject == subject).collect(Collectors.toList());
        OptionalDouble average = grades.stream().mapToDouble(a -> a.average()).average();
        System.out.println("=================================");
        System.out.println("El promedio general de la clase es: "+average.getAsDouble());
        System.out.println("=================================");
        return average.getAsDouble();
    }
}

class Iassing{
    int student;
    int subject;
    int grade1;
    int grade2;
    int grade3;

    public int average(){
        return (grade1+grade2+grade3)/3;
    }
}
