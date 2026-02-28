import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy");
        Date buggyDate = null;
        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear));
            // Mutant: Added a duplicate assignment statement with a different format
            buggyDate = new SimpleDateFormat("dd/MM/yyyy").parse(String.format("%03d/%03d", dayOfYear, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buggyDate;
    }

    public static void main(String[] args) {
        MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
        Date buggyDate = bug.showBug(2022, 73);
        System.out.println("Buggy Date: " + buggyDate);
    }
}