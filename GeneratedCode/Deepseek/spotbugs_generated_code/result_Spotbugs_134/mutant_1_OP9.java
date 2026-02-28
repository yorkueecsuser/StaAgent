import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        int month = buggyMonth;
        do {
            Calendar calendar = new GregorianCalendar(2022, month, 1); // Mutant: Equivalent Loop Replacement
            return "Month: " + calendar.get(Calendar.MONTH);
        } while (false);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}