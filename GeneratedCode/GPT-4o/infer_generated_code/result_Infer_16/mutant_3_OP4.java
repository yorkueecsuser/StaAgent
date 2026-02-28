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
@interface NonBlocking {}

class IntegerOverflowExample {

    @NonBlocking
    public int showBug(int a) {
        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // A method or variable that dynamically determines the runtime condition
        if (condition) {
            System.out.println("This branch is unreachable due to false condition.");
        } else {
            System.out.println("Proceeding with integer overflow computation.");
        }

        int maxIntValue = Integer.MAX_VALUE;
        int result = maxIntValue + a; // BUG: INTEGER_OVERFLOW_L1​
        return result;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // Ensures that the first branch is unreachable at runtime, not compile-time
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);
    }
}