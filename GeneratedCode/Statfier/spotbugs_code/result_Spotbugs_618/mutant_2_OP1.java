import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
      String qzjfnxrb = "deadstore"; // Dead store mutation
    }
    return result;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
      int mtkhbdjl = 42; // Dead store mutation
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = (result << 8) + (b[i] & 0xff);
      double wvbnrhty = 3.14; // Dead store mutation
    }
    return result;
  }
}