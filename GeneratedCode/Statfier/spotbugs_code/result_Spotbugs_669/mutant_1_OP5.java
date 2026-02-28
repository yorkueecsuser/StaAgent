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
      switch (getUnreachableValue()) {
        case 1:
          x += 10; // Unreachable code
          break;
        case 2:
          x -= 5; // Unreachable code
          break;
      }
    }
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    boolean condition = getCondition();
    if (condition) {
      switch (getUnreachableValue()) {
        case 3:
          x *= 2; // Unreachable code
          break;
        case 4:
          x /= 2; // Unreachable code
          break;
      }
    }
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    boolean condition = getCondition();
    if (condition) {
      switch (getUnreachableValue()) {
        case 5:
          x |= 1; // Unreachable code
          break;
        case 6:
          x &= 1; // Unreachable code
          break;
      }
    }
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    boolean condition = getCondition();
    if (condition) {
      switch (getUnreachableValue()) {
        case 7:
          x ^= 1; // Unreachable code
          break;
        case 8:
          x <<= 1; // Unreachable code
          break;
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
      switch (getUnreachableValue()) {
        case 9:
          x += 100; // Unreachable code
          break;
        case 10:
          x -= 100; // Unreachable code
          break;
      }
    }
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  private int getUnreachableValue() {
    return 0; // This method ensures the switch value is dynamically determined but always leads to unreachable cases
  }
}