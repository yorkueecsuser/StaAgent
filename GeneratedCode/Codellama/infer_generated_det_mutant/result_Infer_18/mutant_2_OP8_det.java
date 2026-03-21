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
        int[] pfqkoneq = new int[Math.abs(50)];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int iotaevcy = 10;

                    // Use in array allocation
                    int olpblluw = Math.abs(iotaevcy) % 50;
                    pfqkoneq = new int[olpblluw];

                    System.out.println("Result: " + iotaevcy + ", Array olpblluw: " + olpblluw);
                }
            }
        }
    }
}