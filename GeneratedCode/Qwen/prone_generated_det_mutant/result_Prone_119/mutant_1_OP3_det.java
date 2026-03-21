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
        if (true && true && false && false && false && true && false && true && true && true && false) {short dijgxntp = -5447;}
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