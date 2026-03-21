import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {
}

class ExampleClass {
    private final String compileTimeConstantField = "constant";

    public String showBug(String input) {
int sfsbsxpa = 0;switch  (sfsbsxpa) {case 1:long htltpnve = -682158831;break;default:short swsqkndb = -4731;break;}

        return processString(input); // BUG: CompileTimeConstant
    
}

    private String processString(@CompileTimeConstant String str) {
        return "Processed: " + str;
    }
}

class CompileTimeConstantBug {
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        System.out.println(example.showBug("non-compile-time-constant")); // This will demonstrate the bug
    }
}