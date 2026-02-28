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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code due to conditionWhile being false
            System.out.println("This is unreachable due to false condition");
        }
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code due to conditionWhile being false
            System.out.println("This is unreachable due to false condition");
        }
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
    }

    public void callTopCost() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code due to conditionWhile being false
            System.out.println("This is unreachable due to false condition");
        }
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code due to conditionWhile being false
            System.out.println("This is unreachable due to false condition");
        }
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }
}