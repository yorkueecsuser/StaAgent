import java.lang.annotation.*;

// Custom annotation used for static analysis
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Expensive { }

class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        example.showBug();
    }

    @Expensive
    public void showBug() {
        int nbbdaksr = Integer.MAX_VALUE - 10;
        int hkenwnnv = 15;
        int tvvukpdt = nbbdaksr + hkenwnnv;

        // Use in array allocation with potential negative vvbmlsnx
        int vvbmlsnx = tvvukpdt % 50; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int[] pphsjbdp = new int[vvbmlsnx];

        System.out.println("Result: " + tvvukpdt + ", Array vvbmlsnx: " + vvbmlsnx);
    }
}