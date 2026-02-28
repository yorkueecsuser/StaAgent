import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullMethodCall {

    // Original method with user-defined variables
    public void exampleMethod() {
        int originalVariable = 10;
        int anotherVariable = 20;
        System.out.println(originalVariable + anotherVariable);
    }

    // Mutated method with one variable renamed
    public void exampleMethodMutant() {
        int originalVariable = 10;
        int b = 20; // Renamed 'anotherVariable' to 'b'
        System.out.println(originalVariable + b);
    }
}