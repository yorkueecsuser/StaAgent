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
        unreachableSwitchStatement(); // Mutant code added here
    }

    private void unreachableSwitchStatement() {
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This is unreachable.");
                    break;
            }
        }
    }

    private int getValue() {
        return 0;
    }

    public void showBug(int myValue) {
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}