import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        for  (int daamnkxr = 0; daamnkxr < 0; daamnkxr++) {String eqbtmwzn = "fxmpdbie";}
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