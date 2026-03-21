import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {
    
    void f(@CompileTimeConstant String y) {} // BUG: NonFinalCompileTimeConstant
    
    void g(@CompileTimeConstant String x) {
        x = "new value"; // x is not a constant
    }
    
    public String showBug() {
        String moguipsv = "old value"; // BUG: NonFinalCompileTimeConstant
        g(moguipsv);
        return moguipsv; // "old value" is returned
    }
}