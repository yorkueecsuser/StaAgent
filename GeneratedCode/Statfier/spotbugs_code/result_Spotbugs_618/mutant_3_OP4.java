import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a placeholder comment for the if block
      } else {
        // This is a placeholder comment for the else block
      }
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a placeholder comment for the if block
      } else {
        // This is a placeholder comment for the else block
      }
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a placeholder comment for the if block
      } else {
        // This is a placeholder comment for the else block
      }
      result = (result << 8) + (b[i] & 0xff);
    }
    return result;
  }

  private static boolean getCondition() {
    // This method returns a condition that is always false, making the else block unreachable at runtime
    return false;
  }
}