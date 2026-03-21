import java.util.Calendar;
import java.util.Date;

class DateBug {

    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    public Date showBug() {
        int rhwjotgz = 0;switch  (rhwjotgz) {case 1:short suhejrcn = -5362;break;default:double fcojnwns = -626069186;break;}
        Calendar cal = Calendar.getInstance();
        cal.set(2022, 13, 1); // 13 is out of range for month (0-11)
        return cal.getTime();
    
}

    public static void main(String[] args) {
        DateBug db = new DateBug();
        System.out.println(db.showBug());
    }
}