import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public boolean getCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date buggyDate = null;
        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear)); // 3 is March
            if (getCondition()) { // Unreachable if branch
                System.out.println("This line is unreachable due to the false condition.");
            }
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