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
        boolean rejzdphn = false;while (rejzdphn && true && true && false && false && true && true && true && true && true && true && false) {long gnxnfrys = 407956531;}
        String x = "old value"; // BUG: NonFinalCompileTimeConstant
        g(x);
        return x; // "old value" is returned
    
}
}