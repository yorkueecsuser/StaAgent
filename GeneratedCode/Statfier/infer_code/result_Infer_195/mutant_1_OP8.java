import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Adding a dummy method to demonstrate the renaming mutation
    default void dummyMethod() {
        String originalName = "example";
        System.out.println(originalName);
        
        // Mutant: Renaming 'originalName' to 'a'
        String a = "example";
        System.out.println(a);
    }
}