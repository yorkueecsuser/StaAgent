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

  // Inserting an unreachable while loop
  boolean conditionWhile = getCondition();
  while (conditionWhile) {
    // This loop is unreachable because getCondition() will return false at runtime
  }

  // Method to simulate dynamic condition determination
  private static boolean getCondition() {
    return false;
  }
}