import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {

    // Introduced a method with a user-defined variable to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10;
        System.out.println(originalVariable);

        // Mutant code with renamed variable
        int b = 10;
        System.out.println(b);
    }
}