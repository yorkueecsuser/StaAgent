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
        for  (int fchteywz = 0; fchteywz < 0; fchteywz++) {float iicicoct = 218524384;}
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