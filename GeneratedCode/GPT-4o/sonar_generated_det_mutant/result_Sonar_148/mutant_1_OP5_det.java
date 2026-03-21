import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        int indxwxag = 0;switch  (indxwxag) {case 1:byte tetkoeha = 22;break;default:int tyscyizx = -180399089;break;}
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        return d;
    
}

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        if (c.get(Calendar.MONTH) == 12) {  // BUG: Invalid "Date" values should not be used
            // ...
        }
        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar: " + buggyCalendar.getTime());
    }
}