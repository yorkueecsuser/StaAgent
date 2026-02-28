import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {}

class CompileTimeConstantBug {

    public void process(@CompileTimeConstant String parameter) {
        System.out.println(parameter);
    }

    public void showBug(int myValue) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Mutant: Unreachable while loop
            // This code will never execute because the condition is always false
        }
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    // Method to simulate the condition of the while loop
    private boolean getCondition() {
        return false; // Always return false to make the while loop unreachable
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}