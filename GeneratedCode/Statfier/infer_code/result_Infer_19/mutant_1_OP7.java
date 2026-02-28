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

  // Introduced an unreachable while loop as per the mutation operator description
  boolean getCondition() {
    return false;
  }

  default void introduceUnreachableLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }
}