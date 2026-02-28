import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement in m3.");
    }
  }

  public void m4() {
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement in m4.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if blocks unreachable
    return false;
  }
}