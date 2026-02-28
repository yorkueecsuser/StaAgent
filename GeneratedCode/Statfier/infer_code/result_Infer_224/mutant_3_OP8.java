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

    // Introduced a simple method to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        int result = originalVariable + anotherVariable;
        System.out.println("Result: " + result);
    }

    // Mutated method with one variable renamed
    public static void mutatedExampleMethod() {
        int x = 10; // Renamed 'originalVariable' to 'x'
        int anotherVariable = 20;
        int result = x + anotherVariable;
        System.out.println("Result: " + result);
    }
}