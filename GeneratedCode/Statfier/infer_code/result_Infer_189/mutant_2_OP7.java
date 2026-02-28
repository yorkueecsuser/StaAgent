import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable loop");
    }
    
    return null;
  }

  public void externalMethod2(@Nullable Object object) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is another unreachable loop");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}