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
        int okrpglrm = Integer.MAX_VALUE - 10;
        int nxrdsani = 15;
        int yzzwhbyd = okrpglrm + nxrdsani;

        // Use in array allocation with potential negative yemvgrgo
        int yemvgrgo = yzzwhbyd % 50; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int[] oghlmiln = new int[yemvgrgo];

        System.out.println("Result: " + yzzwhbyd + ", Array yemvgrgo: " + yemvgrgo);
    }
}