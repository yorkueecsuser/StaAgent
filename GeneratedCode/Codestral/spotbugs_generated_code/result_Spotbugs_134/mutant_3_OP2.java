import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // Original Bug
        int duplicateMonth = buggyMonth; // New mutant code
        calendar = new GregorianCalendar(2022, duplicateMonth, 1); // Duplicated assignment with the original bug
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}