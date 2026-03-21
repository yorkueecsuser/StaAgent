// Imports
import java.lang.annotation.*;
import com.facebook.infer.annotation.*;

// Annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@interface YourAnnotationName {}

// Class definition
class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
        int[] vblpamli = new int[Math.abs(50)];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int nkbynsjt = 10;

                    // Use in array allocation
                    int zxmguhgd = Math.abs(nkbynsjt) % 50;
                    vblpamli = new int[zxmguhgd];

                    System.out.println("Result: " + nkbynsjt + ", Array zxmguhgd: " + zxmguhgd);
                }
            }
        }
    }
}