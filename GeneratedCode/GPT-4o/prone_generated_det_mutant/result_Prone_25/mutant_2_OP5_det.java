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
        int wlbsyvkx = 0;switch  (wlbsyvkx) {case 1:byte itdofegc = -114;break;default:float cbtrspfe = -925998708;break;}
        printMessage(nonConstantMessage); // BUG: CompileTimeConstant
    
}

    public static void main(String[] args) {
        CompileTimeConstantDemo demo = new CompileTimeConstantDemo();
        demo.showBug(42);
    }
}