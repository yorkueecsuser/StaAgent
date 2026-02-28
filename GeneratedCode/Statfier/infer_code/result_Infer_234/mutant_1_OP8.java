import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Introducing a method with a variable to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10; // Original variable
        int a = originalVariable;  // Mutant variable
        System.out.println(a);
    }

    // Original method without mutation
    public static void originalExampleMethod() {
        int originalVariable = 10;
        System.out.println(originalVariable);
    }
}