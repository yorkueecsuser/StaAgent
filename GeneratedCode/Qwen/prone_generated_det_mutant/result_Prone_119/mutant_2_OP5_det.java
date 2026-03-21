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
        int iacyxrkl = 0;switch  (iacyxrkl) {case 1:String qwnehsmr = "kkcmqfxx";break;default:byte ymdnsllt = 96;break;}
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