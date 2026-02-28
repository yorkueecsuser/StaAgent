import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Hypothetical method to demonstrate mutation
    default void hypotheticalMethod() {
        int example = 5;  // Original assignment statement
        int example = 5;  // Duplicated assignment statement
    }
}