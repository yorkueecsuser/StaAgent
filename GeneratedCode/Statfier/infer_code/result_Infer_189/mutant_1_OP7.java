import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Introduced an unreachable while loop as per the mutation operator
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable while loop.");
    }
  }
}