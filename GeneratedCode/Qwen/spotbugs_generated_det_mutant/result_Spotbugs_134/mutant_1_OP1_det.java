import java.util.Calendar;

class MonthBugDemo {

    public int showBug() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        String ajlmohtw = "anciqpsa";
        calendar.set(Calendar.MONTH, 12); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return calendar.get(Calendar.MONTH);
    
}

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}