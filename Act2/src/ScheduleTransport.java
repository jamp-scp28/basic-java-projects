public class ScheduleTransport {
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

}
