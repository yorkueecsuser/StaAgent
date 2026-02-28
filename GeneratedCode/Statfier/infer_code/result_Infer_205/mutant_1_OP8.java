import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {

    // Hypothetical method to demonstrate renaming mutation
    public static void hypotheticalMethod() {
        String originalVariable = "someValue"; // Original variable
        String b = originalVariable; // Renamed variable
        System.out.println(b);
    }
}