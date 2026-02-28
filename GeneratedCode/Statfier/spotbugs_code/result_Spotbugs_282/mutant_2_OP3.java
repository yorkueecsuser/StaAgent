import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed either");
    }
  }

  private boolean getCondition() {
    return false;
  }
}