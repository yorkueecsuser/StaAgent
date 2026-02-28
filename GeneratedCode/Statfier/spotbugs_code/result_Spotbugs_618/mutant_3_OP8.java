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

  // Mutated method with renamed variable
  @ExpectWarning("")
  static long getLong_mutated(byte[] x) {
    long a = 0;
    for (int j = 0; j < x.length; j++) {
      a = a << 8 + (x[j] & 0xff); // parsed as a << (8 + (x[j] & 0xff));
    }
    return a;
  }

  @NoWarning("")
  static long getLong2(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = result << 8 | (b[i] & 0xff); // parsed as result << (8 + (b[i] & 0xff));
    }
    return result;
  }

  // Mutated method with renamed variable
  @NoWarning("")
  static long getLong2_mutated(byte[] x) {
    long a = 0;
    for (int j = 0; j < x.length; j++) {
      a = a << 8 | (x[j] & 0xff); // parsed as a << (8 + (x[j] & 0xff));
    }
    return a;
  }

  @NoWarning("")
  static long getLongFixed(byte[] b) {
    long result = 0;
    for (int i = 0; i < b.length; i++) {
      result = (result << 8) + (b[i] & 0xff);
    }
    return result;
  }

  // Mutated method with renamed variable
  @NoWarning("")
  static long getLongFixed_mutated(byte[] x) {
    long a = 0;
    for (int j = 0; j < x.length; j++) {
      a = (a << 8) + (x[j] & 0xff);
    }
    return a;
  }
}