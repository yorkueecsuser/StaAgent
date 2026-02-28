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
        // Adding an unreachable for loop
        boolean conditionFor = getCondition(); // This method ensures the condition is non-final
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to the condition
            System.out.println("This is an unreachable loop.");
        }
        
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // A method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}