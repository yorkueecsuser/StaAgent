import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Mutation: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            switch (buggyMonth) {
                case 13: // This case is unreachable because buggyMonth is always within 0-11
                    System.out.println("This line should never be executed.");
                    break;
            }
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}