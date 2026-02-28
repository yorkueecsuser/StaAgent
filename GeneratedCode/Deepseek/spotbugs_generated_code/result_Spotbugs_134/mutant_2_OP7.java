import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        boolean conditionWhile = false; // Condition for unreachable while loop
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Inserted unreachable while loop
        while (conditionWhile) {
            System.out.println("This code should never be executed.");
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}