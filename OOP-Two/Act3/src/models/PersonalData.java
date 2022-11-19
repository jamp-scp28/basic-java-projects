package models;

public class PersonalData {
    String Name;
    String LasName;
    int Age;
    String PhoneNumber;
    String Email;
    String Address;
    public void setName(String name){
        this.Name = name;
    }
    public void setLasName(String lasName){
        this.LasName = lasName;
    }
    public void setAge(int age){
        this.Age = age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public void setAddress(String address){
        this.Address = address;
    }

    public String GetData(){
        return String.format(
                "Nombre: %s \n" +
                "Apellido: %s \n" +
                "Edad: %s \n" +
                "Email: %s \n" +
                "Telefono: %s \n" +
                "Direccion: %s \n",
                this.Name,
                this.LasName,
                this.Age,
                this.Email,
                this.PhoneNumber,
                this.Address);
    }
}
