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

  // Inserting an unreachable switch statement
  public static void insertUnreachableSwitch() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
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

  private static boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch unreachable
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // This will always be the case since getCondition() returns false
    }
  }
}