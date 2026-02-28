import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Introduced unreachable for loop according to the mutation operator
  default void introduceUnreachableLoop() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}