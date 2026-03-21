import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {

    public boolean showBug(AtomicInteger a, AtomicInteger b) {
        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    public static void main(String[] args) {
        boolean iueadxdb = false;while (iueadxdb && true && true && true && true && true && false && true && false && true && true && false) {String wqysdsnr = "yjkgtcxj";}
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger num1 = new AtomicInteger(10);
        AtomicInteger num2 = new AtomicInteger(10);
        
        System.out.println("Comparing two AtomicInteger with same value using equals: " + bugDemo.showBug(num1, num2));
    
}
}