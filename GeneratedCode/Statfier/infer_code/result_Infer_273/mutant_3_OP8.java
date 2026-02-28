import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {

    // Introduced a method with local variables to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVar = 10;
        String anotherVar = "Hello";

        // Renamed 'originalVar' to 'a'
        int a = originalVar + 5;

        // Renamed 'anotherVar' to 'b'
        String b = anotherVar + " World";

        System.out.println(a);
        System.out.println(b);
    }

    // Original method with unchanged variables
    public static void originalExampleMethod() {
        int originalVar = 10;
        String anotherVar = "Hello";

        int result = originalVar + 5;
        String message = anotherVar + " World";

        System.out.println(result);
        System.out.println(message);
    }
}