import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {}

class CompileTimeConstantBug {

    public void process(@CompileTimeConstant String parameter) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { /* Unreachable code */
            System.out.println("Unreachable while loop");
        }
        System.out.println(parameter);
    }

    public boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public void showBug(int myValue) {
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}