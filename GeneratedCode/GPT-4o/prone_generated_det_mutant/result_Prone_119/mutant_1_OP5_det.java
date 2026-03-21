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
        int hdnpmicr = 0;switch  (hdnpmicr) {case 1:int xygbqorj = -971635707;break;default:short ubutbgnm = 8964;break;}
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