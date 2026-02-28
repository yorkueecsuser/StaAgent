import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {
    // Dummy variable introduced for mutation demonstration
    String originalVariable = "dummy";

    // Mutant: Renamed the dummy variable to 'x'
    String x = "dummy";
}