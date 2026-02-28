import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Added unreachable while loop according to mutation operator
  default boolean getCondition() {
    return false;
  }

  default void addUnreachableWhileLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
  }
}