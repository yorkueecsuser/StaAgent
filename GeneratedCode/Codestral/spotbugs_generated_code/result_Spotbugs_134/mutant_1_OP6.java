import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        for (int i = 0; isAlwaysFalse(); i++) {  // Inserted unreachable for loop
            // This loop will never be entered because isAlwaysFalse() always returns false
        }
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static boolean isAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}