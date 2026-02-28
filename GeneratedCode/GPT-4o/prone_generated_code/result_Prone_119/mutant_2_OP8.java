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

    // Mutant method with renamed variable
    public void g_mutant(@CompileTimeConstant String a) {
        a = f(a); // BUG: NonFinalCompileTimeConstant
        System.out.println(a);
    }

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
        
        // Call the mutant method
        new CompileTimeConstantExample().g_mutant("Hello, Mutant!");
    }
}