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

    @Expensive // This annotation is used for demonstration purposes.
    public int squareRoot(int x) {
        int i = 0;
        boolean condition = getFalseCondition(); // Unreachable if branch.
        if (condition) {
            // This code is unreachable.
            System.out.println("This is unreachable");
        }
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        boolean condition = getFalseCondition(); // Unreachable if branch.
        if (condition) {
            // This code is unreachable.
            System.out.println("This is unreachable");
        }
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
    }

    public void callTopCost() {
        boolean condition = getFalseCondition(); // Unreachable if branch.
        if (condition) {
            // This code is unreachable.
            System.out.println("This is unreachable");
        }
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        boolean condition = getFalseCondition(); // Unreachable if branch.
        if (condition) {
            // This code is unreachable.
            System.out.println("This is unreachable");
        }
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }

    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}