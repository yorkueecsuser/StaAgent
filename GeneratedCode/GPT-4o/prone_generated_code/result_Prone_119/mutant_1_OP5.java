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
        
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case does nothing, making the above case unreachable
        }
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Method to ensure the unreachable switch statement remains unreachable
    private int getUnreachableValue() {
        return 0; // Return a value that does not match any switch case
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}