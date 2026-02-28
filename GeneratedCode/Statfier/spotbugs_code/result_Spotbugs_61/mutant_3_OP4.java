import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_IDIV_CAST_TO_DOUBLE {

  @ExpectWarning("ICAST_IDIV_CAST_TO_DOUBLE")
  void bug(int x, int y) {
    double d = (x / y);
    System.out.println(d);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the if block unreachable
    return false;
  }
}