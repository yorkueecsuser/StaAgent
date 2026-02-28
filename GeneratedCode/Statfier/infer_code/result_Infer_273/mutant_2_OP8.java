import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {

    // Introducing a method with variables to demonstrate renaming mutation
    public static void exampleMethod() {
        int originalVariable = 10;
        String anotherVariable = "test";
        System.out.println(originalVariable + " " + anotherVariable);
    }

    // Mutant version with renamed variable
    public static void exampleMethodMutant() {
        int a = 10; // Renamed 'originalVariable' to 'a'
        String anotherVariable = "test";
        System.out.println(a + " " + anotherVariable);
    }
}