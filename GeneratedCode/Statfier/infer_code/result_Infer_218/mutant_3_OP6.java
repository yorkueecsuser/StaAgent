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

  // Inserting an unreachable for loop
  default boolean getCondition() {
    return false;
  }

  default void insertUnreachableLoop() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }
}