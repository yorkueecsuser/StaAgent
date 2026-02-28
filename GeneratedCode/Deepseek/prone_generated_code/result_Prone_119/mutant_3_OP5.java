import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Random;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {

    void f(@CompileTimeConstant String y) {} // BUG: NonFinalCompileTimeConstant

    void g(@CompileTimeConstant String x) {
        x = "new value"; // x is not a constant
    }

    public String showBug() {
        String x = "old value"; // BUG: NonFinalCompileTimeConstant
        g(x);
        Random rand = new Random();
        switch (rand.nextInt(10)) { // Non-reachable switch statement
            case 1:
                System.out.println("Unreachable");
                break;
            default:
                System.out.println("Reachable");
                break;
        }
        return x; // "old value" is returned
    }
}