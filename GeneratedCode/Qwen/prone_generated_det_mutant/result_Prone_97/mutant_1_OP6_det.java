import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        for  (int beeawlvm = 0; beeawlvm < 0; beeawlvm++) {boolean imyhemge = true;}
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