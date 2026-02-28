import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmvObj = new BadMonthValue(); // Renaming 'bmv' to 'bmvObj'
        System.out.println(bmvObj.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}