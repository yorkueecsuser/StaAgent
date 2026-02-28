import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Added mutant code
  default boolean getCondition() {
    return false;
  }

  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement due to mutant insertion.");
    }
  }
}