import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public boolean getCondition() {
        return false;
    }

    public String showBug(int buggyMonth) {
        while (getCondition()) {
            // Unreachable while loop
            // This loop is inserted but it is unreachable because the condition is always false
            // This is to satisfy the mutation operator requirement
        }

        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}