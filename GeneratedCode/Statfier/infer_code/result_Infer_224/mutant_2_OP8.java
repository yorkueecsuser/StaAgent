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

    // Dummy method to introduce a user-defined variable for mutation
    public default void dummyMethod() {
        String originalName = "example"; // Original variable name
        String a = originalName; // Renamed variable name to 'a'
    }
}