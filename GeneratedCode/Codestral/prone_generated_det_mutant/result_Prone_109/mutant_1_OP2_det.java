import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date buggyDate = null;
        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear)); // 3 is March
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buggyDate;
    }
public static void main(String [] args){
    MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
    Date buggyDate = bug.showBug(2022 , 73);
    buggyDate = bug.showBug(2022 , 73);
    System.out.println("Buggy Date: " + buggyDate);
}
}