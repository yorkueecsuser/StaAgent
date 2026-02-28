import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Mutant addition: Unreachable if-else statement
  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("Condition is true");
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is unreachable code");
    }
  }

  default boolean getCondition() {
    return false;
  }
}