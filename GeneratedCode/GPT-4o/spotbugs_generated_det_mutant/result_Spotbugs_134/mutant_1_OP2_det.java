import java.util.Calendar;

class BadMonthExample {
public String showBug() {
    Calendar calendar = Calendar.getInstance();
    calendar = Calendar.getInstance();
    calendar.set(2023 , 12 , 25);
    return calendar.getTime().toString();
}

    public static void main(String[] args) {
        BadMonthExample example = new BadMonthExample();
        System.out.println(example.showBug());
    }
}