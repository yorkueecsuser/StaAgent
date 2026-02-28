import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block
      System.out.println("This is the alternative block");
    }
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is another unreachable block");
    } else {
      // Alternative block
      System.out.println("This is another alternative block");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}