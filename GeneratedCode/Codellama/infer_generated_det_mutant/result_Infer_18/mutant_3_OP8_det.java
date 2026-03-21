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
        int[] lbltjfdo = new int[Math.abs(50)];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int fozpwodw = 10;

                    // Use in array allocation
                    int knujmovj = Math.abs(fozpwodw) % 50;
                    lbltjfdo = new int[knujmovj];

                    System.out.println("Result: " + fozpwodw + ", Array knujmovj: " + knujmovj);
                }
            }
        }
    }
}