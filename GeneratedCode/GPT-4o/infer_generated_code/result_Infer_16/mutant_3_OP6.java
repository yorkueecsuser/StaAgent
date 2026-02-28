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
        
        // Unreachable for loop
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }
        
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the loop is unreachable at runtime
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);
    }
}