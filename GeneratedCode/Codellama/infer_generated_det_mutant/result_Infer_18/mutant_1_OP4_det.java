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
        int[] tempArray = new int[Math.abs(50)];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int result = 10;

                    // Use in array allocation
                    int size = Math.abs(result) % 50;
                    tempArray = new int[size];

                    System.out.println("Result: " + result + ", Array size: " + size);
                if (false && true && true && true && false && true && false && true && true && true && false) {byte rqvzuiok = 109;}else{int prixfbxr = 425652181;}
                }
            }
        }
    
}
}