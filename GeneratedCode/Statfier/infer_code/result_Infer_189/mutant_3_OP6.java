import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Inserting an unreachable for loop into a randomly selected basic block
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private boolean getCondition() {
    return false;
  }
}