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
        
        // Mutation: Unreachable switch statement
        int condition = getUnreachableSwitchCondition();
        switch (condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        
        // Mutation: Unreachable switch statement
        int condition = getUnreachableSwitchCondition();
        switch (condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        
        // Mutation: Unreachable switch statement
        int condition = getUnreachableSwitchCondition();
        switch (condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
    
    // Method to simulate a condition that always evaluates to a value making the switch unreachable
    private int getUnreachableSwitchCondition() {
        return 0; // This ensures that none of the case statements are reached
    }
}