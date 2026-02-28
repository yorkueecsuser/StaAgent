import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());

        // Mutated code
        Calendar b = Calendar.getInstance();
        b.set(Calendar.YEAR, 2022);
        b.set(Calendar.MONTH, 5);
        int c = b.get(Calendar.MONTH);
        System.out.println("Mutated month value: " + c);
    }
}