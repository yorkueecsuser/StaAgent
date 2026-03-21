import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        int himeomui = 0;switch  (himeomui) {case 1:int odvzzgrh = -172773380;break;default:float uedyozsn = 396855639;break;}
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    
}

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}