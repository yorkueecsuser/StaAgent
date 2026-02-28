import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Hypothetical method with a user-defined variable for demonstration
    default void exampleMethod() {
        String originalVariable = "example";
        System.out.println(originalVariable);
        
        // Mutated variable
        String b = "example";
        System.out.println(b);
    }
}