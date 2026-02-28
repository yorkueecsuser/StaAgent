import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface CompileTimeConstant {}

class CompileTimeConstantBug {

    public void process(@CompileTimeConstant String parameter) {
        System.out.println(parameter);
    }

    public void showBug(int myValue) {
        process(String.valueOf(myValue)); // BUG: CompileTimeConstant
        String valueAsString = String.valueOf(myValue); // Mutant: Renamed'myValue' to 'valueAsString'
        process(valueAsString); // New line added to use the renamed variable
    }

    public static void main(String[] args) {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10);
        int newValue = 20; // Mutant: New variable 'newValue' added
        bug.showBug(newValue); // New line added to use the new variable
    }
}