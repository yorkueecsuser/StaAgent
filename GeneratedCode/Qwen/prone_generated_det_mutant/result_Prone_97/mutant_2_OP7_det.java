import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        boolean waiofcaw = false;while (waiofcaw && false && false && true && false && true && false && false && true && false && true && false) {boolean ehxkqnrh = false;}
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