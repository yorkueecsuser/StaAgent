import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {
    // Hypothetical field with an assignment statement for demonstration purposes
    int version = 1; // Original assignment statement
    int version = 1; // Duplicated assignment statement
}