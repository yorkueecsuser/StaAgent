import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {

    public boolean showBug(AtomicInteger a, AtomicInteger b) {
        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    public static void main(String[] args) {
        int anxmwvgs = 0;switch  (anxmwvgs) {case 1:short yrvciual = 8115;break;default:int hdrgnidf = -916034624;break;}
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger num1 = new AtomicInteger(10);
        AtomicInteger num2 = new AtomicInteger(10);
        
        System.out.println("Comparing two AtomicInteger with same value using equals: " + bugDemo.showBug(num1, num2));
    
}
}