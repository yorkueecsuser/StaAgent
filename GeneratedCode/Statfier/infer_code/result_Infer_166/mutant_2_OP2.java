import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressParameterNotNullable {}

class Example {
    public static void main(String[] args) {
        int x = 5; // Original assignment statement
        int x = 5; // Duplicated assignment statement
        System.out.println(x);
    }
}