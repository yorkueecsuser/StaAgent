import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {
    // Hypothetical method to demonstrate renaming mutation
    default void hypotheticalMethod() {
        String originalVariable = "dummy";
        // Mutant code with renamed variable
        String b = "dummy";
    }
}