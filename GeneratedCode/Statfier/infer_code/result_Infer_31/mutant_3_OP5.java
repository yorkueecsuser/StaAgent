import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation tells the thread-safety analysis to assume that mutations in the annotated
 * class/field/method are confined to the given thread name. For the thread name, you can either use
 * the default constants UI/ANY or add your own.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface ThreadConfined {
  /** the thread that the mutations should be confined to */
  String value();
  /** confined to the UI thread */
  public static String UI = "UI";
  /** confined to any thread (but only that thread!) */
  public static String ANY = "ANY";

  // Added mutant code with an unreachable switch statement
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
          System.out.println("Case 1");
          break;
        case 2:
          System.out.println("Case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}