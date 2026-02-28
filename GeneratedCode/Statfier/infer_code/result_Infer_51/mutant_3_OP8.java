import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {
    // Adding a dummy method to introduce a variable
    default void dummyMethod() {
        String originalName = "example";
        System.out.println(originalName);
        
        // Mutated variable
        String b = "example";
        System.out.println(b);
    }
}