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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            x = f(x); // BUG: NonFinalCompileTimeConstant
            System.out.println(x);
        }
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the condition effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}