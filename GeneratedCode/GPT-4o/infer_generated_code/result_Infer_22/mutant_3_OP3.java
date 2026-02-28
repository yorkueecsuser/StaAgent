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
        // Introduce a variable for unreachable if statement condition
        boolean unreachableConditionA = getUnreachableCondition();
        if (unreachableConditionA) {
            // Unreachable code block
            System.out.println("This is unreachable in functionA");
        }

        if (x > 0) {
            return functionB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 0;
        }
    }

    @Functional
    public int functionB(int x) {
        // Introduce a variable for unreachable if statement condition
        boolean unreachableConditionB = getUnreachableCondition();
        if (unreachableConditionB) {
            // Unreachable code block
            System.out.println("This is unreachable in functionB");
        }

        if (x > 0) {
            return functionA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    public int showBug(int x) {
        return functionA(x);
    }

    // Method to return a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}