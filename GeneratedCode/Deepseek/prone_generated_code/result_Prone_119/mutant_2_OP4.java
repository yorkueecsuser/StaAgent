import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {
    
    void f(@CompileTimeConstant String y) {}
    
    void g(@CompileTimeConstant String x) {
        x = "new value"; // x is not a constant
        if (false) { // Unreachable if-else statement
            x = "old value";
        }
    }
    
    public String showBug() {
        String x = "old value";
        g(x);
        return x;
    }
}