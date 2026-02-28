import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void m4() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}