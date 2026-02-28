import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {
    // Original code does not have user-defined variables, introducing a dummy variable for demonstration
    String exampleVariable = "dummy";

    // Mutant: Renaming the dummy variable to 'a'
    String a = "dummy";
}