import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {

    // Adding a method with a variable to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10; // Original variable
        System.out.println(originalVariable);
    }

    // Mutated method with renamed variable
    public static void exampleMethodMutated() {
        int a = 10; // Renamed variable
        System.out.println(a);
    }
}