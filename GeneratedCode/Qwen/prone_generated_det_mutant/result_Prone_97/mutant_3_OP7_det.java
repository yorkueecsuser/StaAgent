import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        boolean lmcbimwj = false;while (lmcbimwj && false && true && false && true && false && false && true && true && false && true && false) {double samvanyk = -445956310;}
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