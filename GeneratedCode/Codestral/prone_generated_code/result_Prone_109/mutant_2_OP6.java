import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy");
        Date buggyDate = null;

        // Unreachable for loop mutation
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable because the condition is always false
            System.out.println("This is an unreachable for loop.");
        }

        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear));
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