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
        return functionA(x);
    }

    public static void main(String[] args) {
        MutualRecursionExample example = new MutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}

// Mutated Code Begins
class MutatedMutualRecursionExample {

    @Functional
    public int functionA(int y) {
        if (y > 0) {
            return functionB(y - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 0;
        }
    }

    @Functional
    public int functionB(int y) {
        if (y > 0) {
            return functionA(y - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    public int showBug(int y) {
        return functionA(y);
    }

    public static void main(String[] args) {
        MutatedMutualRecursionExample example = new MutatedMutualRecursionExample();
        System.out.println(example.showBug(5)); // To demonstrate the bug
    }
}
// Mutated Code Ends