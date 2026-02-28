import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            calendar.set(Calendar.MONTH, 0); // Setting to a valid month value, but this line is unreachable
        }

        return calendar.get(Calendar.MONTH);
    }

    private boolean getCondition() {
        // Always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}