import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_01_04 {
  @ExpectWarning("")
  static long getLong(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 + (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  // Mutant 1: Renamed'result' to 'x'
  @ExpectWarning("")
  static long getLong_mutant1(byte[] b) {
    long x = 0;
    for (int i = 0; i < b.length; i++) {
      x = x << 8 + (b[i] & 0xff); // parsed as x << (8 + (b[i] & 0xff));
    }
    return x;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  // Mutant 2: Renamed 'i' to 'j'
  @NoWarning("")
  static long getLong2_mutant2(byte[] b) {
    long result = 0;
    for (int j = 0; j < b.length; j++) {
      result = result << 8 | (b[j] & 0xff); // parsed as result << (8 + (b[j] & 0xff));
    }
    return result;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = (result << 8) + (b[i] & 0xff);
    }
    return result;
  }

  // Mutant 3: Renamed 'b' to 'c'
  @NoWarning("")
  static long getLongFixed_mutant3(byte[] c) {
    long result = 0;
    for (int i = 0; i < c.length; i++) {
      result = (result << 8) + (c[i] & 0xff);
    }
    return result;
  }
}