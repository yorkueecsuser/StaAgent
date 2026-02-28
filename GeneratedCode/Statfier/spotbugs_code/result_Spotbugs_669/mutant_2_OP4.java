import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Random;

class Ideas_2010_09_13 {

  static final int SHIFT_AMOUNT = 32;

  @NoWarning("ICAST")
  public int testWarningForDeadCode(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        x = x + 1; // This line is unreachable because condition is always false
      } else {
        x = x - 1; // This line is also unreachable
      }
    }
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        x = x * 2; // This line is unreachable because condition is always false
      } else {
        x = x / 2; // This line is also unreachable
      }
    }
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        x = x + 10; // This line is unreachable because condition is always false
      } else {
        x = x - 10; // This line is also unreachable
      }
    }
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        x = x + 5; // This line is unreachable because condition is always false
      } else {
        x = x - 5; // This line is also unreachable
      }
    }
    return x << SHIFT_AMOUNT;
  }

  final Random r = new Random();

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_RANDOM_INT")
  public int testRandomInt() {
    int x = Math.abs(r.nextInt());
    if (x == Integer.MIN_VALUE) return 0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        x = x + 100; // This line is unreachable because condition is always false
      } else {
        x = x - 100; // This line is also unreachable
      }
    }
    return x;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}