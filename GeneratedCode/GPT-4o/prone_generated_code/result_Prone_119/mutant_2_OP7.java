import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @CompileTimeConstant annotation for demonstration purposes
@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {}

class CompileTimeConstantExample {

    public void showBug() {
        g("Hello, World!");
        boolean conditionWhile = getCondition(); // Ensure the condition is a method call
        while (conditionWhile) {
            // This block is unreachable because the condition is always false
            System.out.println("This message will never be printed.");
        }
    }

    public void g(@CompileTimeConstant String x) {
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}