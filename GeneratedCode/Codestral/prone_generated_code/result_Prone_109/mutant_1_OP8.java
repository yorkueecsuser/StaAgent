import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat a = new SimpleDateFormat("MM/DD/yyyy"); // Mutant: Renamed buggyFormat to a
        Date buggyDate = null;
        try {
            buggyDate = a.parse(String.format("%03d/%03d", 3, dayOfYear)); // 3 is March
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buggyDate;
    }

    public static void main(String[] args) {
        MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
        Date buggyDate = bug.showBug(2022, 73); // Attempting to create 'March 73rd, 2022'
        System.out.println("Buggy Date: " + buggyDate);
    }
}