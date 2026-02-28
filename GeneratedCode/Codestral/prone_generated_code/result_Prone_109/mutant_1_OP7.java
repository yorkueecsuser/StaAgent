import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public boolean getCondition() {
        return false; // Always return false to make the while loop unreachable
    }

    public Date showBug(int year, int dayOfYear) {
        // Mutant added here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }

        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date buggyDate = null;
        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear)); // 3 is March
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