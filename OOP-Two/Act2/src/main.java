import java.io.Console;
import java.util.Scanner;

public class main {

    public static void main(String args[]){

        Customer one = new Customer();
        one.email = "admin@gmail.com";
        one.password = "admin";
        one.role = "Admin";

        String getUser = one.GetUser();
        System.out.println(getUser);

        // Authentication
        Authentication authentication = new Authentication(one);
        String loginResponse = authentication.Login();

        System.out.println(loginResponse);

    }
}
