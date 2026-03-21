import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
int pbihgxyj = 0;switch  (pbihgxyj) {case 1:String ncmgwtvm = "pgukbvgh";break;default:float pirbnxol = 182729161;break;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}