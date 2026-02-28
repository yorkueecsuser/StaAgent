import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Introducing a simple method to demonstrate renaming mutation
    String exampleMethod() default "example";

    // Mutant: Renaming 'exampleMethod' to 'a'
    String a() default "example";
}