import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {
    // Introducing a dummy variable to demonstrate renaming mutation
    int someVariable = 0; // Original variable
    int b = 0; // Mutated variable
}