import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {
    // Dummy method to introduce a user-defined variable for mutation
    default void dummyMethod() {
        String originalVariable = "originalValue";
        String m = originalVariable; // Renamed variable
    }
}