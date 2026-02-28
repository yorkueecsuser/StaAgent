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
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
                break;
        }
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Helper method to always return a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0; // The switch case is set to 9999, so this will make it unreachable
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}