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

        // Add unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // This block is reachable, but does nothing
                break;
        }
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Helper method to ensure the switch is unreachable
    private int getUnreachableValue() {
        return 0; // Always returns a value not handled in the switch statement
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}