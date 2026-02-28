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
        // Unreachable for loop mutant
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This block of code is unreachable
            System.out.println("Unreachable Code");
        }

        process(String.valueOf(myValue));
    }

    // Method to generate a condition dynamically
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}