import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {}

class ExampleClass {
    public void exampleMethod() {
        int originalVariable = 10; // Original variable
        System.out.println(originalVariable);
        
        // Mutated variable
        int b = 10; // New name 'b' for the variable
        System.out.println(b);
    }
}