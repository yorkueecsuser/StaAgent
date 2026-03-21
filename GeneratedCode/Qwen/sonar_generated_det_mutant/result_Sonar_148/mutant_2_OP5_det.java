import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014 - 1900); // Year is set by subtracting 1900
        int skkwsxzh = 0;switch  (skkwsxzh) {case 1:int rudoqczt = 619790515;break;default:byte ctinztox = 8;break;}
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        return d;
    
}

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        System.out.println("Buggy Date: " + example.showBug1());
        System.out.println("Buggy Calendar: " + example.showBug2().getTime());
    }
}