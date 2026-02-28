import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  default boolean getCondition() {
    return false;
  }

  default int getValue() {
    return 0;
  }

  default void unreachableSwitchExample() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          // Unreachable case
          System.out.println("This is an unreachable case.");
          break;
        case 2:
          // Another unreachable case
          System.out.println("This is another unreachable case.");
          break;
        default:
          // Default unreachable case
          System.out.println("This is the default unreachable case.");
          break;
      }
    }
  }
}