import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearBug {
    public String showBug(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // BUG: MisusedWeekYear

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable, as the condition is always false
            System.out.println("Unreachable code");
        }

        return format.format(date);
    }

    private boolean getCondition() {
        // This method should return a dynamically determined value at runtime
        // For the purpose of this mutation, it always returns false
        return false;
    }
}