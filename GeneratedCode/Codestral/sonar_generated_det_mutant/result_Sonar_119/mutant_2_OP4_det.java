import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
if (true && false && true && true && false && true && false && false && true && true && false) {byte rckldnji = 50;}else{String naxmpzah = "xathfpmn";}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}