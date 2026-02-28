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
        boolean unreachableCondition = getUnreachableCondition();
        // Inserted unreachable if-else statement
        if (unreachableCondition) {
            System.out.println("This line should never execute.");
        } else {
            process(String.valueOf(myValue));
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}