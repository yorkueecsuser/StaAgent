import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Added do-while loop as per the mutation operator description
        int i = 0;
        do {
            // This loop does nothing and is just for mutation purposes
            i++;
        } while (i < 0);

        return calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}