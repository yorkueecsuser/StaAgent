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
            
            // Unreachable if statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
            
            // Unreachable if statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
    
    // Helper method to ensure the condition is always false
    private boolean getFalseCondition() {
        return false;
    }
}