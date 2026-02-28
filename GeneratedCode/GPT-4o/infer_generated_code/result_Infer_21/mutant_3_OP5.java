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
        
        // Introducing an unreachable switch statement
        int unreachableValue = -1; // This value ensures the switch is unreachable
        switch (unreachableValue) {
            case 0:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This default is unreachable too");
        }

        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        
        // Introducing an unreachable switch statement
        int unreachableValue = -1; // This value ensures the switch is unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This default is unreachable too");
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​

        // Introducing an unreachable switch statement
        int unreachableValue = -1; // This value ensures the switch is unreachable
        switch (unreachableValue) {
            case 2:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This default is unreachable too");
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
}