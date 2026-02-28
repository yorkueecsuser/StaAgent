import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {

    // Introduced method with a variable to demonstrate renaming mutation
    public void exampleMethod() {
        int originalVariable = 10; // Original variable
        System.out.println(originalVariable);
    }

    // Mutant method with renamed variable
    public void exampleMethodMutant() {
        int b = 10; // Mutated variable
        System.out.println(b);
    }
}