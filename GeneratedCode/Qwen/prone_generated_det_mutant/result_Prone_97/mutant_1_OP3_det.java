import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        if (true && false && false && false && true && false && false && true && false && true && false) {char muxqyrnk = 'e';}
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