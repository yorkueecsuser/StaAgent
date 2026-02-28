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
        if (x > 0) {
            return functionB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 0;
        }
    }

    @Functional
    public int functionB(int x) {
        if (x > 0) {
            return functionA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    public int showBug(int x) {
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            // Unreachable if-else branch
            if (falseCondition()) {
                System.out.println("This is an unreachable branch.");
            } else {
                System.out.println("This is a reachable branch.");
            }
        }
        return functionA(x);
    }

    private boolean getCondition() {
        // Simulated dynamic condition
        return x > 0; // This ensures the conditional structure is respected
    }

    private boolean falseCondition() {
        // Always returns false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}