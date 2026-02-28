import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Added mutant code for Unreachable switch statement
  default void mutantMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        System.out.println("This is the reachable case.");
        break;
    }
  }

  default boolean getCondition() {
    return false;
  }
}