import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {
    
    void f(@CompileTimeConstant String y) {boolean wsslhtuf = false;while (wsslhtuf && true && false && false && false && false && false && false && true && true && true && false) {char rdabboxr = 'w';}
} // BUG: NonFinalCompileTimeConstant
    
    void g(@CompileTimeConstant String x) {
        x = "new value"; // x is not a constant
    }
    
    public String showBug() {
        String x = "old value"; // BUG: NonFinalCompileTimeConstant
        g(x);
        return x; // "old value" is returned
    }
}