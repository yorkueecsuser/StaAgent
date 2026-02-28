import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public boolean getCondition() {
        return false; // Always returns false to make the if-else statement unreachable
    }

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code block
            System.out.println("This code should not execute.");
        } else {
            // This block is always executed because getCondition() always returns false
            System.out.println("This code is executed instead.");
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}