import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {

    // Hypothetical method to demonstrate renaming mutation
    public static void hypotheticalMethod() {
        String originalVariable = "Some data";
        System.out.println(originalVariable);
    }

    // Mutated method with renamed variable
    public static void hypotheticalMethodMutant() {
        String b = "Some data";
        System.out.println(b);
    }
}