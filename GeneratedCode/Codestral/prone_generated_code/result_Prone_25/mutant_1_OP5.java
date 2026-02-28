import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {}

class CompileTimeConstantBug {

    public void process(@CompileTimeConstant String parameter) {
        // Adding unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This case is unreachable
                    System.out.println("This is an unreachable case");
                    break;
            }
        }
        System.out.println(parameter);
    }

    public void showBug(int myValue) {
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }

    // Methods to dynamically determine conditions
    private boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
    }

    private int getValue() {
        return 2; // Any value other than 1 to make the switch statement unreachable
    }
}