import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable if statement in m3.");
    }
  }

  public void m4() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable if statement in m4.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}