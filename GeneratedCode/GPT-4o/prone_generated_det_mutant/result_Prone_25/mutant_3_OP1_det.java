import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation to simulate @CompileTimeConstant
@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {}

// Class demonstrating CompileTimeConstant bug
class CompileTimeConstantDemo {

    // Method with a parameter expected to be a compile-time constant
    public void printMessage(@CompileTimeConstant String message) {
        System.out.println(message);
    }

    // Method to demonstrate the bug
    public void showBug(int input) {
        String nonConstantMessage = "This is a non-constant message: " + input; // This is not a compile-time constant
        short cmjyrrdt = 6121;
        printMessage(nonConstantMessage); // BUG: CompileTimeConstant
    
}

    public static void main(String[] args) {
        CompileTimeConstantDemo demo = new CompileTimeConstantDemo();
        demo.showBug(42);
    }
}