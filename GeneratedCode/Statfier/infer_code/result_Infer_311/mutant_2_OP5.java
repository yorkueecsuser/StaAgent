import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Introduced an unreachable switch statement
  default void unreachableSwitch() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed.");
        break;
      default:
        // Default case is also unreachable for the same reason
        System.out.println("This will also never be printed.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}