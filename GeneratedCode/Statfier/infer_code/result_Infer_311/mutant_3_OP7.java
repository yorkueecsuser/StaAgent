import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Added mutant code with an unreachable while loop
  default boolean getCondition() {
    return false;
  }

  default void mutantMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable while loop");
    }
  }
}