import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
int kwkgukyt = 0;switch  (kwkgukyt) {case 1:byte emptzvxi = 77;break;default:String mqwfkxtl = "mknqekes";break;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}