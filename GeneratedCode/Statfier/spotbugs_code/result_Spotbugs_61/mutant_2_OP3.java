import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_IDIV_CAST_TO_DOUBLE {

  @ExpectWarning("ICAST_IDIV_CAST_TO_DOUBLE")
  void bug(int x, int y) {
    double d = (x / y);
    System.out.println(d);

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}