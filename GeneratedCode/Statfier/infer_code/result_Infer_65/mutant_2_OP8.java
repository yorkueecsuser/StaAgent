import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.TYPE,
})
public @interface Verify {
    // Adding a default method to demonstrate renaming
    default void check() {
        String originalName = "test";
        System.out.println(originalName);
        
        // Mutated code with renamed variable
        String b = "test";
        System.out.println(b);
    }
}