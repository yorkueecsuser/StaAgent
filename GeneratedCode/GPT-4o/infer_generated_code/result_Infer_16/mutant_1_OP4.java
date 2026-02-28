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
        int maxIntValue = Integer.MAX_VALUE;
        int result = maxIntValue + a; // BUG: INTEGER_OVERFLOW_L1​
        
        // Unreachable if-else branch
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the else block of the unreachable if statement.");
        }
        
        return result;
    }

    private boolean getFalseCondition() {
        // This method is designed to always return false
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);
    }
}