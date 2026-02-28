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

  default int getValue() {
    return 0;
  }

  default void addUnreachableSwitch() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          System.out.println("This is case 1");
          break;
        case 2:
          System.out.println("This is case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}