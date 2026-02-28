import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {}

class CompileTimeConstantBug {

    public void process(@CompileTimeConstant String parameter) {
        if (isConditionFalse()) { // Unreachable if statement
            System.out.println("This code will never be executed");
        }
        System.out.println(parameter);
    }

    private boolean isConditionFalse() { // Method to dynamically determine the condition
        return false;
    }

    public void showBug(int myValue) {
        process(String.valueOf(myValue));
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}