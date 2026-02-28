import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {
    // Dummy method to introduce a variable for mutation
    default void dummyMethod() {
        String originalName = "dummy";
        String x = originalName; // Introducing a variable 'x' for renaming mutation
    }
}