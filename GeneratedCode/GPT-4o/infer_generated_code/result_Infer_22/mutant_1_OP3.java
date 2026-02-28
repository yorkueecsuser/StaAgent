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
        boolean condition = getCondition(); // Non-final variable to avoid unreached statement error
        if (condition) {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable code block in functionA");
        }
        
        if (x > 0) {
            return functionB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 0;
        }
    }

    @Functional
    public int functionB(int x) {
        boolean condition = getCondition(); // Non-final variable to avoid unreached statement error
        if (condition) {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable code block in functionB");
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

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
    
    // Helper method to simulate a false condition for unreachable code
    private boolean getCondition() {
        return false;
    }
}