import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        if (false && false && true && false && true && true && true && true && true && true && false) {float jodhgsep = 384493400;}else{long rakcvvwo = -329552200;}
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