import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface YourAnnotationName {}

/**
 * This class demonstrates the infinite execution time bug.
 */
class InfiniteExecutionTimeBug {
    /**
     * This method calculates the square root of a number.
     * @param x the number to calculate the square root of
     * @return the square root of x
     */
    // BUG: INFINITE_EXECUTION_TIME​
    @YourAnnotationName
    public int square_root_FP(int x) { 
        int i = 0; 
        boolean mutatedWhileCondition = getMutatedCondition(); 
        while (i * i < x && mutatedWhileCondition) {  
            i++; 
        }
        while (false) { 
            // Unreachable while loop mutation
        }
        return i;
    }

    /**
     * This method demonstrates the infinite execution time bug.
     * @return the result of the infinite execution time bug
     */
    public int showBug() {
        return square_root_FP(1);
    }

    /**
     * This is a method to ensure the while loop condition is mutated.
     * @return a boolean which is always true
     */
    public boolean getMutatedCondition() {
        return true;
    }
}