import java.lang.annotation.*;
import java.util.ArrayList;

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
@interface Expensive {}

class InfiniteExecutionExample {
    
    // A method to simulate a dynamic false condition
    private boolean isAlwaysFalse() {
        return false;
    }

    @Expensive // This annotation is used for demonstration purposes.
    public int squareRoot(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        // Inserting unreachable if-else branch using a dynamic condition
        if (isAlwaysFalse()) {
            System.out.println("Unreachable code in squareRoot");
        } else {
            System.out.println("This else branch is also unreachable");
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        // Inserting unreachable if-else branch using a dynamic condition
        if (isAlwaysFalse()) {
            System.out.println("Unreachable code in loopOverCharArray");
        } else {
            System.out.println("This else branch is also unreachable");
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        // Inserting unreachable if-else branch using a dynamic condition
        if (isAlwaysFalse()) {
            System.out.println("Unreachable code in callTopCost");
        } else {
            System.out.println("This else branch is also unreachable");
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        // Inserting unreachable if-else branch using a dynamic condition
        if (isAlwaysFalse()) {
            System.out.println("Unreachable code in showBug");
        } else {
            System.out.println("This else branch is also unreachable");
        }
        return squareRoot(x);
    }
}