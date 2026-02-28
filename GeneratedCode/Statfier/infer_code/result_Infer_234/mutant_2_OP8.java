import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Introduced a method with some variables to demonstrate renaming mutation
    public void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        int sum = originalVariable + anotherVariable;
        System.out.println("Sum: " + sum);
    }

    // Mutated version of the method with one variable renamed
    public void exampleMethodMutated() {
        int originalVariable = 10;
        int b = 20; // Renamed 'anotherVariable' to 'b'
        int sum = originalVariable + b;
        System.out.println("Sum: " + sum);
    }
}