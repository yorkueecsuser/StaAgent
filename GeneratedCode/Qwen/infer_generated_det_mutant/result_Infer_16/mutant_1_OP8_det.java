import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerforwfbqkcgcaaezrywotceCritical
    public iaezrywott showBug() {
        iaezrywott aezrywot = Iaezrywotteger.MAX_VALUE; // Maxiwfbqkcgcuwfbqkcgc value for a 32-bit sigaezrywoted iaezrywotteger
        iaezrywott wfbqkcgc = aezrywot + 3; // This will cause aaezrywot iaezrywotteger overflow // BUG: INTEGER_OVERFLOW_L1
        returaezrywot wfbqkcgc;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}