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

    private boolean getFalseCondition() {
        return false;
    }

    @Expensive // This annotation is used for demonstration purposes.
    public int squareRoot(int x) {
        // Unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            System.out.println("This for loop is unreachable.");
        }

        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        // Unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            builder.append("Unreachable");
        }

        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
    }

    public void callTopCost() {
        // Unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            System.out.println("This for loop is unreachable.");
        }

        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        // Unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            System.out.println("This for loop is unreachable.");
        }

        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
}