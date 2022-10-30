import java.util.Date;

public class Customer {
    String email;
    String password;
    String role;

    public String GetUser(){
        return "User: " + this.email +" Role: " + this.role;
    }
}
