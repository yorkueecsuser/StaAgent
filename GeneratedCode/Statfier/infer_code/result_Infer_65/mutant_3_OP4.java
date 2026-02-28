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

    // Mutant code added here
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will never run
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code that will always run
            System.out.println("This is reachable code.");
        }
    }
}