import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {
    // Introduced a simple method to include a variable for renaming mutation
    default void sampleMethod() {
        String originalVariable = "Sample Text";
        System.out.println(originalVariable);
        
        // Mutant code with renamed variable
        String b = "Sample Text";
        System.out.println(b);
    }
}