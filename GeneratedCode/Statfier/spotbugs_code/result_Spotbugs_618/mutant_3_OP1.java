import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      String unusedVariable1 = "abcdefgh"; // Dead store
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      int unusedVariable2 = 12345678; // Dead store
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      double unusedVariable3 = 98765432.1; // Dead store
      result = (result << 8) + (b[i] & 0xff);
    }
    return result;
  }
}