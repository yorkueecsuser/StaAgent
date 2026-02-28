import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {

    // Introduced a method with a user-defined variable to demonstrate renaming mutation
    public default void exampleMethod() {
        String originalVariable = "example";
        System.out.println(originalVariable);

        // Mutant: Renamed 'originalVariable' to 'b'
        String b = "example";
        System.out.println(b);
    }
}