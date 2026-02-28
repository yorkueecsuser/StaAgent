import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface Prop {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  String varArg() default "";

  // Introduced an unreachable while loop according to the mutation operator
  default boolean getCondition() {
    return false;
  }

  default void introduceUnreachableLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable loop");
    }
  }
}