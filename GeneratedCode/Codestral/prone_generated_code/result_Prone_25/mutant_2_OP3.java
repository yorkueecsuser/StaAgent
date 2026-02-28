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
        process(String.valueOf(myValue));
        boolean unreachableCondition = getUnreachableCondition(); // added method call for dynamic condition
        if (unreachableCondition) { // unreachable if statement
            System.out.println("This line should never be executed.");
        }
    }

    // added method to provide dynamic condition for if statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}