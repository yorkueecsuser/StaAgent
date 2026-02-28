import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.TYPE,
})
public @interface Verify {

    // Introduced a method with a variable to demonstrate renaming mutation
    public default void exampleMethod() {
        int originalVariable = 10;
        System.out.println(originalVariable);
    }

    // Mutant: Renamed 'originalVariable' to 'a'
    public default void exampleMethodMutant() {
        int a = 10;
        System.out.println(a);
    }
}