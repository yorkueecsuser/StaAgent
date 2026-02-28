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

    public static void main(String[] args) {
        new CompileTimeConstantExample().showBug();
    }
}

// Mutant code starts here
class CompileTimeConstantExampleMutant {

    public void showBug() {
        g("Hello, World!");
    }

    public void g(@CompileTimeConstant String a) { // Renamed parameter `x` to `a`
        a = f(a); // Renamed variable `x` to `a`
        System.out.println(a); // Renamed variable `x` to `a`
    }

    public String f(@CompileTimeConstant String b) { // Renamed parameter `y` to `b`
        return b + " Modified"; // Renamed variable `y` to `b`
    }

    public static void main(String[] args) {
        new CompileTimeConstantExampleMutant().showBug();
    }
}