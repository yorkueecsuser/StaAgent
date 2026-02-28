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
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        
        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code in squareRoot.");
        } else {
            System.out.println("This is also unreachable in squareRoot.");
        }
        
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        
        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code in loopOverCharArray.");
        } else {
            System.out.println("This is also unreachable in loopOverCharArray.");
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        
        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code in callTopCost.");
        } else {
            System.out.println("This is also unreachable in callTopCost.");
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
    
    // Helper method to simulate a condition at runtime
    private boolean getCondition() {
        return false;
    }
}