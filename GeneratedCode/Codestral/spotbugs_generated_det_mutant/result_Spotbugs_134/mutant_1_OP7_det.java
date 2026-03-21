import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        boolean yutwfbvn = false;while (yutwfbvn && true && true && true && false && true && true && false && true && true && false && false) {short hpzjvmmp = 9782;}
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    
}

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}