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
        // Unreachable switch statement inserted here
        int unreachableSwitchValue = getUnreachableSwitchValue(); // Dynamically determined condition
        switch(unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable switch case.");
                break;
            default:
                break;
        }

        return functionA(x);
    }

    private int getUnreachableSwitchValue() {
        // This method returns a value that never matches the switch case
        return 0; // Ensures the switch case is never executed
    }

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}