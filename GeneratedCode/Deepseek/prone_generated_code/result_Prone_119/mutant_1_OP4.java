import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {
    
    void f(@CompileTimeConstant String y) {} // BUG: NonFinalCompileTimeConstant

    // Mutation on g method
    void g(@CompileTimeConstant String x) {
        x = "new value"; // x is not a constant
        boolean shouldRun = false; // Unreachable if condition
        if (shouldRun) {
            // Unreachable code
            System.out.println("Unreachable code");
        } else {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
    
    public String showBug() {
        String x = "old value"; // BUG: NonFinalCompileTimeConstant
        g(x);
        return x; // "old value" is returned
    }
}