import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            calendar.set(Calendar.MONTH, 11);
        } else {
            // This block will always execute
            calendar.set(Calendar.DAY_OF_MONTH, 15);
        }

        return calendar.get(Calendar.MONTH);
    }

    private boolean getCondition() {
        // Always returns false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}