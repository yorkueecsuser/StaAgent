import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        boolean tfqpnica = false;while (tfqpnica && true && true && false && true && true && true && true && false && false && true && false) {char gqgkipzr = 't';}
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