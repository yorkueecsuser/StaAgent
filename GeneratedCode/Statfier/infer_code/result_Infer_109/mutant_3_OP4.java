import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will run if condition is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void m4() {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will run if condition is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}