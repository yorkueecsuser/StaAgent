import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Random;

class Ideas_2010_09_13 {

  static final int SHIFT_AMOUNT = 32;

  @NoWarning("ICAST")
  public int testWarningForDeadCode(int x) {
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    return x << SHIFT_AMOUNT;
  }

  final Random r = new Random();

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_RANDOM_INT")
  public int testRandomInt() {
    int x = Math.abs(r.nextInt());
    if (x == Integer.MIN_VALUE) return 0;
    return x;
  }

  // Mutated code
  @NoWarning("ICAST")
  public int testWarningForDeadCode3(int y) {
    return SHIFT_AMOUNT == 32? y : y << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode4(int z) {
    return SHIFT_AMOUNT!= 32? z << SHIFT_AMOUNT : z;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning3(int a) {
    return a << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning4(int b) {
    return b << SHIFT_AMOUNT;
  }

  final Random s = new Random();

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_RANDOM_INT")
  public int testRandomInt2() {
    int c = Math.abs(s.nextInt());
    if (c == Integer.MIN_VALUE) return 0;
    return c;
  }
}