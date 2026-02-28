import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something user-controlled
      ElementType.PARAMETER, // parameter is user-controlled
      ElementType.FIELD, // field is user-controlled
    })
public @interface IntegritySource {

    // Introduced a sample method to demonstrate renaming mutation
    public static void sampleMethod() {
        int originalVariable = 10; // Original variable
        int anotherVariable = 20;  // Another variable to rename

        // Perform some operations
        int result = originalVariable + anotherVariable;

        // Print the result
        System.out.println("Result: " + result);
    }

    // Mutated version of the method with one variable renamed
    public static void sampleMethodMutated() {
        int originalVariable = 10; // Original variable
        int b = 20;  // Renamed variable 'anotherVariable' to 'b'

        // Perform some operations
        int result = originalVariable + b;

        // Print the result
        System.out.println("Result: " + result);
    }
}