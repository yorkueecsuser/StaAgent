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
        boolean condition = getCondition();
        if (condition) {
            switch (myValue) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable case");
                    break;
            }
        }
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}