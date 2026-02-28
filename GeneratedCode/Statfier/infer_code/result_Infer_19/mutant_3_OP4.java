import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
})
public @interface SuppressLint {
  String[] value();

  // Inserted unreachable if-else statement
  default boolean getCondition() {
    return false;
  }

  default void checkCondition() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }
}