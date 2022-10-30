import static java.util.Objects.nonNull;
import static jdk.dynalink.linker.support.Guards.isNull;

public class Authentication {
    private Customer customer;

    public Authentication(Customer customer){
        this.customer = customer;
    }

    public String Login(){
        if(nonNull(this.customer)){
            if(this.customer.email.contentEquals("admin") && this.customer.password.contentEquals("admin")) return "jwtToken";
        }
        return "Error login the user";
    }

    public String Register(){
        if(nonNull(this.customer)){
            //Save into the database the user
            return "JWTToken";
        }
        return "Error registering the user";
    }

    public void Logout(){
        // Destroy user session
    }
}
