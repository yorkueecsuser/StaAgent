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
        
        // Unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 9999:
                System.out.println("This is unreachable.");
                break;
            default:
                // No default action
                break;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);
    }

    // A method to provide a dynamically determined condition
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch case unreachable
    }
}