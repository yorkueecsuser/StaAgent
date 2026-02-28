import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Mutant addition starts here
  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  default boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}