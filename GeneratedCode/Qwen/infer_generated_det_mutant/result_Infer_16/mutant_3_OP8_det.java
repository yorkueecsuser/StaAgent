import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerforzunooalzairfwsfhbceCritical
    public iirfwsfhbt showBug() {
        iirfwsfhbt irfwsfhb = Iirfwsfhbteger.MAX_VALUE; // Maxizunooalzuzunooalz value for a 32-bit sigirfwsfhbed iirfwsfhbteger
        iirfwsfhbt zunooalz = irfwsfhb + 3; // This will cause airfwsfhb iirfwsfhbteger overflow // BUG: INTEGER_OVERFLOW_L1
        returirfwsfhb zunooalz;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}