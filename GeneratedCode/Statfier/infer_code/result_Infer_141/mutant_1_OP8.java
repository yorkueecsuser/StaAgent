import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something private
      ElementType.PARAMETER, // parameter is private
      ElementType.FIELD, // field is private
    })
public @interface PrivacySource {

    // Added a simple method to demonstrate renaming mutation
    public static void exampleMethod() {
        String originalVariable = "This is a test";
        System.out.println(originalVariable);

        // Mutant: Renaming originalVariable to x
        String x = "This is a test";
        System.out.println(x);
    }
}