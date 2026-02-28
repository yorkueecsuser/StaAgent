import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @CompileTimeConstant annotation for demonstration purposes
@Retention(RetentionPolicy.RUNTIME)
@interface CompileTimeConstant {}

class CompileTimeConstantExample {

    public void showBug() {
        g("Hello, World!");
    }

    public void g(@CompileTimeConstant String x) {
        x = f(x); // BUG: NonFinalCompileTimeConstant
        System.out.println(x);
    }

    public String f(@CompileTimeConstant String y) {
        return y + " Modified";
    }

    // Mutated code with renamed variable
    public void g(@CompileTimeConstant String m) {
        m = f(m); // BUG: NonFinalCompileTimeConstant
        System.out.println(m);
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}