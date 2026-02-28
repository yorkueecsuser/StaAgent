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
    int value() default 0; // Hypothetical method with a default value

    // Hypothetical method to demonstrate duplication
    static void hypotheticalMethod() {
        int x = 5; // Assignment statement without method invocation
        x = x + 1; // Another assignment statement without method invocation
    }
}