import java.util.ArrayList;
import java.util.List;

public class Methods {
    List<Student> students = new ArrayList<>();
    List<Administrative> administratives = new ArrayList<>();

    public String scheduleAndTransport(Integer type){
        String data = "";
        if (type == 1){
            data = "User Type: Student \n Schedule: Morning \n Transport: Home - School - Home";
        }
        else if(type == 2){
            data = "User Type: Administrative \n Schedule: 8am-5pm \n Transport: Home - WorkPlace - Home";
        }
        return data;
    };

    public void saveStudent(Student student){
        this.students.add(student);
    }

    public void saveAdministrative(Administrative administrative){
        this.administratives.add(administrative);
    }

    public void getStudent(Integer id){
        this.students.get((id-1));
    }

    public void getAdministrative(Integer id){
        this.students.get((id-1));
    }

    public String printAdministrativeInfo(Integer id){
        String a = this.administratives.get(id-1).printAdministrative();
        return a;
    }

    public String printStudentInfo(Integer id){
        String s = this.students.get(id-1).printStudent();
        return s;
    }

}
