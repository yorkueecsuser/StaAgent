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
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    default boolean getCondition() {
        return false;
    }

    static void someMethod() {
        // Example method to insert the unreachable while loop
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
    }

    static boolean getStaticCondition() {
        return false;
    }
}