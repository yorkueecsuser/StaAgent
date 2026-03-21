import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        if (true && true && false && false && true && true && false && true && true && true && false) {long gjmszvpb = -881578253;}
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