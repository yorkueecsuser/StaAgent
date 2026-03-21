import java.util.Calendar;
import java.util.Date;

class DateBug {

    // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    public Date showBug() {
        int qzvwbjse = 0;switch  (qzvwbjse) {case 1:char jcplahhu = 'z';break;default:double vnvioyzd = -699585803;break;}
        Calendar cal = Calendar.getInstance();
        cal.set(2022, 13, 1); // 13 is out of range for month (0-11)
        return cal.getTime();
    
}

    public static void main(String[] args) {
        DateBug db = new DateBug();
        System.out.println(db.showBug());
    }
}