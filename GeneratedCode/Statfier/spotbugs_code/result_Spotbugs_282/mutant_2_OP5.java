import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);
  }

  // Helper method to ensure dynamic evaluation
  private boolean getCondition() {
    return false;
  }

  // Helper method to ensure dynamic evaluation
  private int getValue(boolean condition) {
    return condition? 1 : 0;
  }
}