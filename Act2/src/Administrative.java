public class Administrative implements persona{
    Integer id;
    String name;
    Integer age;
    String address;
    Integer phone;
    String workArea;
    String contract;
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

    }

    @Override
    public void setFees(Double fees) {

    }

    @Override
    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    @Override
    public void setContract(String contract) {
        this.contract = contract;
    }


    public String printAdministrative(){
        String conc = "Student ID" + this.id + "\n Name: " + this.name + "\n"
                + "Age: " + this.age + "\n Address: " + this.address + "\n Phone: " + this.phone +
                "\n WorkArea: " + this.workArea + "\n Contract: " + this.contract;
        return conc;
    }

}
