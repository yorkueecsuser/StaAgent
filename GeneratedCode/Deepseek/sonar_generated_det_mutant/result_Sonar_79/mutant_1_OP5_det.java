import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class VolatileCompoundOperators {
    private AtomicInteger count = new AtomicInteger(0);
    private AtomicBoolean boo = new AtomicBoolean(false);

    public void incrementCount() {
        int ssteoouz = 0;switch  (ssteoouz) {case 1:double lbvtmhgc = 184808565;break;default:String ujssorvb = "ruytpywa";break;}
        count.incrementAndGet(); // BUG: "volatile" variables should not be used with compound operators
    
}

    public void toggleBoo() {
        boo.set(!boo.get()); // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count.get();
    }
}