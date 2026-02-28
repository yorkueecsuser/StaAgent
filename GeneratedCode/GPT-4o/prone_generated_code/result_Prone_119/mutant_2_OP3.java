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
        // Adding an unreachable if statement
        boolean condition = getCondition(); // Non-final variable to ensure no unreachable statement error
        if (condition) {
            System.out.println("This will never be printed");
        }

        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Method to simulate a runtime condition always returning false
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}