import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @CompileTimeConstant annotation for demonstration purposes
@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {}

class CompileTimeConstantExample {

    public void showBug() {
        g("Hello, World!");
        
        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable for loop.");
        }
    }

    public void g(@CompileTimeConstant String x) {
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Helper method to ensure the for loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}