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
        x = "new value";
    }
    
    public String showBug() {
        String x = "old value";
        g(x);
        while(false) {} // Unreachable while loop
        return x;
    }
}