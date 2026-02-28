import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {
    int value() default 0; // Hypothetical field with an assignment

    // Hypothetical method to demonstrate mutation
    default void someMethod() {
        int x = 5; // Hypothetical assignment statement
        int x = 5; // Duplicated assignment statement
    }
}