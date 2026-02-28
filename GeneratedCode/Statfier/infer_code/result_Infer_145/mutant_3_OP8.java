import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {

    // Hypothetical method to demonstrate renaming mutation
    public default void hypotheticalMethod() {
        int originalVariable = 10; // Original variable
        int a = originalVariable; // Mutated variable with new name 'a'
        System.out.println(a);
    }
}