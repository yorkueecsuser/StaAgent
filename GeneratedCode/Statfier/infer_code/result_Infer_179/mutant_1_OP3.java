import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Mutant code added here
  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    }
    // Unreachable if statement
    if (!condition && getCondition()) {
      // This block is unreachable because!condition is false and getCondition() returns the same value
      System.out.println("This is an unreachable block.");
    }
  }

  default boolean getCondition() {
    return true;
  }
}