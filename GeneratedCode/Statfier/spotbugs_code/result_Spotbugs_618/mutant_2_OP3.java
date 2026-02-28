import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
      }
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
      }
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
      }
      result = (result << 8) + (b[i] & 0xff);
    }
    return result;
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}