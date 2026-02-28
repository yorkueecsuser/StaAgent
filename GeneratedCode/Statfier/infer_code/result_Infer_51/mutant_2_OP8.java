import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {
    // Introducing a simple method with a variable to rename
    default void exampleMethod() {
        String originalVariable = "example";
        System.out.println(originalVariable);
        
        // Mutant code with renamed variable
        String b = "example";
        System.out.println(b);
    }
}