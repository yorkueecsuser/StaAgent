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
@interface Functional {}

class MutualRecursionExample {

    @Functional
    public int functionA(int x) {
        // Unreachable if-else added here
        boolean condition = getDynamicCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        } else {
            if (x > 0) {
                return functionB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
            } else {
                return 0;
            }
        }
        return -1; // Should never be reached due to logic
    }

    @Functional
    public int functionB(int x) {
        if (x > 0) {
            return functionA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    // Method to provide a dynamic condition
    private boolean getDynamicCondition() {
        return false; // This is dynamic because it's not a compile-time constant
    }

    public int showBug(int x) {
        return functionA(x);
    }

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}