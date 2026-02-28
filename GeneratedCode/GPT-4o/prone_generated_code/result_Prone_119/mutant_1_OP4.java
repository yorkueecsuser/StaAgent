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
        // Unreachable if-else statement introduced
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This will never be printed");
        } else {
            x = f(x); // BUG: NonFinalCompileTimeConstant
            System.out.println(x);
        }
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }

    // Method to simulate a condition that always returns false at runtime
    private boolean getCondition() {
        return false;
    }
}