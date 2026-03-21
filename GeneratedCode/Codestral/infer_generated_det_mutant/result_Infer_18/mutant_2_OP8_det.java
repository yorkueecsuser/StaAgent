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
        int dxhavtxi = Integer.MAX_VALUE - 10;
        int pzljmfvf = 15;
        int fnownczm = dxhavtxi + pzljmfvf;

        // Use in array allocation with potential negative jemxklkw
        int jemxklkw = fnownczm % 50; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int[] jfzegjsp = new int[jemxklkw];

        System.out.println("Result: " + fnownczm + ", Array jemxklkw: " + jemxklkw);
    }
}