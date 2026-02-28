import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // Unreachable code
          result = result + 1;
          break;
        case 1:
          // This is the reachable case
          break;
      }
    }
    return result;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // Unreachable code
          result = result + 1;
          break;
        case 1:
          // This is the reachable case
          break;
      }
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = (result << 8) + (b[i] & 0xff);
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // Unreachable code
          result = result + 1;
          break;
        case 1:
          // This is the reachable case
          break;
      }
    }
    return result;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}