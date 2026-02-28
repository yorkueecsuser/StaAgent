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
        // Mutation: Unreachable for loop
        for (int i = 0; isFalse(); i++) {
            // This loop is unreachable because isFalse() always returns false
            System.out.println("This is an unreachable loop");
        }
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
    }

    public static boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}