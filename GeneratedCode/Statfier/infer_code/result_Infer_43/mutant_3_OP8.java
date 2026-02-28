import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {

    // Introducing a method with some variables for demonstration purposes
    public void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        
        // Perform some operations
        int result = originalVariable + anotherVariable;
        
        // Print the result
        System.out.println("Result: " + result);
        
        // Mutated version of the method with renamed variable
        int b = 10; // Renamed 'originalVariable' to 'b'
        int anotherVariableMutated = 20;
        
        // Perform some operations with mutated variable
        int resultMutated = b + anotherVariableMutated;
        
        // Print the result of mutated version
        System.out.println("Mutated Result: " + resultMutated);
    }
}