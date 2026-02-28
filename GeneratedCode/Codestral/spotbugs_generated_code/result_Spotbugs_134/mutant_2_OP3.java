import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public boolean getCondition() {
        return false; // this will always return false
    }

    public String showBug(int buggyMonth) {
        if (getCondition()) {
            // this branch is unreachable
            System.out.println("This line should never be executed.");
        }
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}