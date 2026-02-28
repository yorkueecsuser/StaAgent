import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Example method to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        int sum = originalVariable + anotherVariable;

        // Renamed variable 'anotherVariable' to 'b'
        int b = anotherVariable + 5;
        System.out.println("Sum: " + sum);
        System.out.println("Modified anotherVariable: " + b);
    }

    public static void main(String[] args) {
        exampleMethod();
    }
}