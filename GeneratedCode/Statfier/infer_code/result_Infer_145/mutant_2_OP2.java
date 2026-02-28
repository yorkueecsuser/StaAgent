import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {
    int someValue() default 0; // Hypothetical method with a default value

    public static void main(String[] args) {
        int x = 5; // Hypothetical assignment statement
        int x = 5; // Duplicated assignment statement
    }
}