import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1);
        Calendar calendarDuplicate = new GregorianCalendar(2022, buggyMonth, 1); // Mutated code: Duplicate assignment
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12));
    }
}