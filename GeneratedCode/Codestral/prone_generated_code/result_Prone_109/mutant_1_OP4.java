import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date buggyDate = null;
        try {
            buggyDate = buggyFormat.parse(String.format("%03d/%03d", 3, dayOfYear)); // 3 is March
            if (getCondition()) { // Reachable code
                System.out.println("Reachable code executed");
            } else { // Unreachable code
                System.out.println("This line of code should be unreachable");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buggyDate;
    }

    private boolean getCondition() {
        return false; // Always false to make the else branch unreachable
    }

    public static void main(String[] args) {
        MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
        Date buggyDate = bug.showBug(2022, 73); // Attempting to create 'March 73rd, 2022'
        System.out.println("Buggy Date: " + buggyDate);
    }
}