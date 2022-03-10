public class Student implements persona{
    Integer id;
    String name;
    Integer age;
    String address;
    Integer phone;
    Integer year;
    Double fees;
    String schedule;
    String transport;

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public void setFees(Double fees) {
        this.fees = fees;
    }

    @Override
    public void setWorkArea(String workArea) {
    }

    @Override
    public void setContract(String contract) {
    }


    public String printStudent(){
        String conc = "Student ID: " + this.id + "\n Name: " + this.name +
                "\n Age: " + this.age + "\n Address: " + this.address + "\n Phone: " + this.phone +
                "\n Year: " + this.year + "\n Fees: " + this.fees;
        return conc;
    }

}
