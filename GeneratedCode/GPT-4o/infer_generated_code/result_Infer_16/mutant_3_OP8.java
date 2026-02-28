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
        return result;
    }

    // Mutant Method
    @NonBlocking
    public int showBugMutant(int b) { // Renamed parameter from 'a' to 'b'
        int maxIntValue = Integer.MAX_VALUE;
        int result = maxIntValue + b; // Renamed variable from 'a' to 'b'
        return result;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);

        // Testing Mutant
        int mutantResult = example.showBugMutant(1);
        System.out.println("Mutant Result: " + mutantResult);
    }
}