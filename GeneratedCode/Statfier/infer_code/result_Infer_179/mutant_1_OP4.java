import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Added mutant code with an unreachable if-else statement
  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      // This branch is unreachable because getCondition() will always return true
      System.out.println("This is unreachable.");
    }
  }

  default boolean getCondition() {
    return true;
  }
}