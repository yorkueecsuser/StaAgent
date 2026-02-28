import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Random;

class Ideas_2010_09_13 {

  static final int SHIFT_AMOUNT = 32;

  @NoWarning("ICAST")
  public int testWarningForDeadCode(int x) {
    String unusedVar1 = "abcdefgh"; // Dead store
    return SHIFT_AMOUNT == 32? x : x << SHIFT_AMOUNT;
  }

  @NoWarning("ICAST")
  public int testWarningForDeadCode2(int x) {
    int unusedVar2 = 12345678; // Dead store
    return SHIFT_AMOUNT!= 32? x << SHIFT_AMOUNT : x;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public int testShiftWarning(int x) {
    boolean unusedVar3 = true; // Dead store
    return x << SHIFT_AMOUNT;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  public long testShiftWarning2(int x) {
    double unusedVar4 = 3.141592; // Dead store
    return x << SHIFT_AMOUNT;
  }

  final Random r = new Random();

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_RANDOM_INT")
  public int testRandomInt() {
    char unusedVar5 = 'a'; // Dead store
    int x = Math.abs(r.nextInt());
    if (x == Integer.MIN_VALUE) return 0;
    return x;
  }
}