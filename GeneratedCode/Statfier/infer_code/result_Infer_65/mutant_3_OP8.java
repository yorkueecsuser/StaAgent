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
    // Introduced a simple method with a variable to demonstrate renaming mutation
    default void exampleMethod() {
        int originalVariable = 10; // Original variable
        System.out.println(originalVariable);
        
        // Mutated variable
        int b = 10; // Renamed variable
        System.out.println(b);
    }
}