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
        boolean hyiszmak = false;while (hyiszmak && true && false && false && false && false && true && true && false && false && true && false) {float vbajnxfo = 897875235;}
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