import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Random;

class Ideas_2010_09_13 {

  static final int SHIFT_AMOUNT = 32;

  @NoWarning("ICAST")
  public int testWarningForDeadCode(int x) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not cause a compile-time error
    if (shouldRun) {
      return x + 1; // Unique unreachable code
    } else {
      return x - 1; // Unique unreachable code
    }
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not cause a compile-time error
    if (shouldRun) {
      return x * 2; // Unique unreachable code
    } else {
      return x / 2; // Unique unreachable code
    }
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not cause a compile-time error
    if (shouldRun) {
      return x ^ 3; // Unique unreachable code
    } else {
      return x | 3; // Unique unreachable code
    }
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not cause a compile-time error
    if (shouldRun) {
      return x & 7; // Unique unreachable code
    } else {
      return x % 7; // Unique unreachable code
    }
    return x << SHIFT_AMOUNT;
  }

  final Random r = new Random();

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_RANDOM_INT")
  public int testRandomInt() {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not cause a compile-time error
    if (shouldRun) {
      return r.nextInt(10); // Unique unreachable code
    } else {
      return r.nextInt(20); // Unique unreachable code
    }
    int x = Math.abs(r.nextInt());
    if (x == Integer.MIN_VALUE) return 0;
    return x;
  }
}