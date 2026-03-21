import java.util.Calendar;
import java.util.Date;

class DateBug {

    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
public Date showBug() {
    Calendar cal = Calendar.getInstance();
    cal = Calendar.getInstance();
    cal.set(2022 , 13 , 1);
    return cal.getTime();
}

    public static void main(String[] args) {
        DateBug db = new DateBug();
        System.out.println(db.showBug());
    }
}