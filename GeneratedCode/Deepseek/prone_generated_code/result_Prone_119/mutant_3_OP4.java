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
        if (false) { //Mutation Operator: Unreachable if-else statement
            //Adding unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
            x = "new value"; 
        } else {
            x = "old value";
        }
        return x; 
    }
}