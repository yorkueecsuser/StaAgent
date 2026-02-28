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
                }
            }
        }
    }
}

// Mutation Operator: Unreachable If-Else Statement
// Description: Inserting an unreachable if-else branch into a randomly selected basic block in the program.
//              The condition of the inserted branch is always false to make it unreachable.

class UnreachableIfElseBranchExample {
    public static void main(String[] args) {
        int[] tempArray = new int[Math.abs(50)];
        int result = 10;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    // Use in array allocation
                    int size = Math.abs(result) % 50;
                    tempArray = new int[size];

                    System.out.println("Result: " + result + ", Array size: " + size);
                } else {
                    // Unreachable branch
                    int unreachableSize = -1;
                    tempArray = new int[unreachableSize];

                    System.out.println("Unreachable branch executed!");
                }
            }
        }
    }
}