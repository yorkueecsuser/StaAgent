import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Unique mutant: Adding a redundant variable assignment that does not affect functionality
        int unusedVariable = 0;
        do {
            unusedVariable++;
        } while (unusedVariable < 1);

        return calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}