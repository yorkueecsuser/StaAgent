import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {
    // Introducing a simple method with a variable to demonstrate renaming mutation
    default void exampleMethod() {
        int originalVariable = 10;
        System.out.println(originalVariable);
    }

    // Mutant: Renaming 'originalVariable' to 'a'
    default void exampleMethodMutant() {
        int a = 10;
        System.out.println(a);
    }
}