import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        int rvvpajrv = 0;switch  (rvvpajrv) {case 1:long jnobvhvo = -229022943;break;default:short bdjjznir = -4746;break;}
        Date sameNow = now; // BUG: JodaToSelf
        return sameNow;
    
}

    public static void main(String[] args) {
        DateTimeExample example = new DateTimeExample();
        Date now = new Date();
        Date result = example.showBug(now);
        System.out.println("Resulting Date: " + result);
    }
}