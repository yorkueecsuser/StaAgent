import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {}

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 0;
  }

  // Mutated code with an unreachable if-else statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will run if condition is true.");
    } else {
      // Unreachable if-else branch
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else branch unreachable
  }
}