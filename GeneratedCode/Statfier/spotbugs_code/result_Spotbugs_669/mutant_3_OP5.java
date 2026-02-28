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
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          x += 10;
          break;
        case 2:
          x -= 10;
          break;
        default:
          x *= 10;
          break;
      }
    }
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          x += 20;
          break;
        case 2:
          x -= 20;
          break;
        default:
          x *= 20;
          break;
      }
    }
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          x += 30;
          break;
        case 2:
          x -= 30;
          break;
        default:
          x *= 30;
          break;
      }
    }
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          x += 40;
          break;
        case 2:
          x -= 40;
          break;
        default:
          x *= 40;
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
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          x += 50;
          break;
        case 2:
          x -= 50;
          break;
        default:
          x *= 50;
          break;
      }
    }
    return x;
  }

  private boolean getCondition() {
    return false;
  }

  private int getUnreachableValue() {
    return 0;
  }
}