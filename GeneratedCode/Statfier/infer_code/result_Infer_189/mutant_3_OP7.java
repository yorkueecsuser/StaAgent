import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable loop");
    }
    return null;
  }

  public void externalMethod2(@Nullable Object object) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is another unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the loops are unreachable
    return false;
  }
}