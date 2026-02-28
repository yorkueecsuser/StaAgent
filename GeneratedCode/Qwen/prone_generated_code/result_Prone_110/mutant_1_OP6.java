import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}