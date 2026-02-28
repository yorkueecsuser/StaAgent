import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYearBug {

    public Date showBug(int y, int d) { // Mutation: Renaming 'year' to 'y' and 'dayOfYear' to 'd'
        SimpleDateFormat buggyFormat = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date yd = null; // Mutation: Renaming 'buggyDate' to 'yd'
        try {
            yd = buggyFormat.parse(String.format("%03d/%03d", 3, d)); // 3 is March
        } catch (Exception e) {
            e.printStackTrace();
        }
        return yd;
    }

    public static void main(String[] args) {
        MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
        Date yd = bug.showBug(2022, 73); // Mutation: Renaming 'buggyDate' to 'yd'
        System.out.println("Buggy Date: " + yd);
    }
}