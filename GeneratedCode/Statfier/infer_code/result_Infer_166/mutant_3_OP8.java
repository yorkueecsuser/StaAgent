import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressParameterNotNullable {

    // Original method with a user-defined variable
    public default void exampleMethod() {
        int originalVariable = 10;
        System.out.println(originalVariable);
    }

    // Mutated method with a renamed variable
    public default void exampleMethodMutant() {
        int a = 10;
        System.out.println(a);
    }
}