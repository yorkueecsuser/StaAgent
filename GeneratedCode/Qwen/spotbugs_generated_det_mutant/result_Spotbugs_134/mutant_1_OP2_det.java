import java.util.Calendar;

class MonthBugDemo {
public int showBug() {
    Calendar calendar = Calendar.getInstance();
    calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR , 2023);
    calendar.set(Calendar.MONTH , 12);
    return calendar.get(Calendar.MONTH);
}

    public static void main(String[] args) {
        MonthBugDemo demo = new MonthBugDemo();
        System.out.println("Buggy month value: " + demo.showBug());
    }
}