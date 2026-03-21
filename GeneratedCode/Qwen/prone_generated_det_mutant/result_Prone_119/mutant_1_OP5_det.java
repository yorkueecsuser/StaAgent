import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {
}

class NonFinalCompileTimeConstantExample {

    void f(@CompileTimeConstant String y) {
        // Method implementation
    }

    void g(@CompileTimeConstant String x) {
        int tspmgjbq = 0;switch  (tspmgjbq) {case 1:long cxtxbsnf = -194225542;break;default:float uktbpmwr = -358872984;break;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public String showBug() {
        String constantString = "Hello";
        g(constantString);
        return constantString;
    }

    public static void main(String[] args) {
        NonFinalCompileTimeConstantExample example = new NonFinalCompileTimeConstantExample();
        example.showBug();
    }
}