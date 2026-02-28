import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Adding a method to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        int result = originalVariable + anotherVariable;
        System.out.println("Result: " + result);
    }

    // Mutated version of the method with renamed variable
    public static void exampleMethodMutated() {
        int a = 10; // Renamed 'originalVariable' to 'a'
        int anotherVariable = 20;
        int result = a + anotherVariable;
        System.out.println("Result: " + result);
    }
}