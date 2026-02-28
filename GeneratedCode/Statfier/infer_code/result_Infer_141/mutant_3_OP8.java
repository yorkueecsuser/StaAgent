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

    // Introducing a dummy method with a variable to demonstrate renaming mutation
    public default void dummyMethod() {
        String originalName = "originalValue"; // Original variable
        String b = originalName; // Renamed variable
        System.out.println(b);
    }
}