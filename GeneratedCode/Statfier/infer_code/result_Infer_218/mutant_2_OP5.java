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

  // Added mutant code
  default boolean getCondition() {
    return false;
  }

  default int getValue() {
    return 0;
  }

  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never execute
      System.out.println("This is unreachable code.");
    }

    int value = getValue();
    switch (value) {
      case 1:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This case is unreachable.");
        break;
      case 2:
        // Another unreachable case
        System.out.println("This case is also unreachable.");
        break;
    }
  }
}