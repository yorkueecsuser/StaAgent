import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
int sutbqpnr = 0;switch  (sutbqpnr) {case 1:float aiqbfgpf = 177961766;break;default:byte tdkyypgn = 12;break;}

        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    
}

    private long buggyTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}