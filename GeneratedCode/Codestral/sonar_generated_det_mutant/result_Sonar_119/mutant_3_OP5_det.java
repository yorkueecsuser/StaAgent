import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
int htiokmvy = 0;switch  (htiokmvy) {case 1:double njiwvdrt = -876677244;break;default:float avxmjzkt = -395399796;break;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}