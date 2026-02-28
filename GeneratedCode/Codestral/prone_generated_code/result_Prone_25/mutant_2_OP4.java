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
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant

        // Added Mutant
        boolean shouldRun = false;
        if (shouldRun) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This branch is always executed
            System.out.println("This line is always executed.");
        }
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
    }
}