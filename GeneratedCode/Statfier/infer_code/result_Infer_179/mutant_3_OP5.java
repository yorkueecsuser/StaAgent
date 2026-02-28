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