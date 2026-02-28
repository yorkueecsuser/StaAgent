import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_IDIV_CAST_TO_DOUBLE {

  @ExpectWarning("ICAST_IDIV_CAST_TO_DOUBLE")
  void bug(int x, int y) {
    double d = (x / y);
    System.out.println(d);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        // Do nothing
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}