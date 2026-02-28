import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public Date showBug(int year, int dayOfYear) {
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy");
        Date buggyDate = null;
        try {
            if (getUnreachableCondition()) {
                switch (dayOfYear) {
                    case 366:
                        // This case is unreachable as dayOfYear is always less than or equal to 365
                        buggyDate = buggyFormat.parse(String.format("%03d/%03d", 12, 31));
                        break;
                }
            }
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