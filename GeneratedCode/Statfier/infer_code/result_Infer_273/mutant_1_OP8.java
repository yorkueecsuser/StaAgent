import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {
    // Adding a sample method to illustrate renaming mutation
    default void sampleMethod() {
        String originalName = "example";
        System.out.println(originalName);
        
        // Mutated code with renaming
        String b = "example";
        System.out.println(b);
    }
}