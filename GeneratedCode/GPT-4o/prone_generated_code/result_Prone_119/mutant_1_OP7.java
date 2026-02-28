import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @CompileTimeConstant annotation for demonstration purposes
@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {}

class CompileTimeConstantExample {

    public void showBug() {
        g("Hello, World!");
    }

    public void g(@CompileTimeConstant String x) {
        boolean conditionWhile = getCondition(); // Unreachable while loop condition
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        }
        
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Method to return a false condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}