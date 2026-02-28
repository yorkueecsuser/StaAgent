import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_07_13 {

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask() {
    int numBits = 32;
    int mask = numBits == 32? 0xffffffff : ((1 << numBits) - 1);
    int abcdefgh = 42; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2() {
    int numBits = 32;
    int mask = numBits >= 32? 0xffffffff : ((1 << numBits) - 1);
    String ijklmnop = "unused"; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3() {
    int numBits = 32;
    int mask = numBits > 31? 0xffffffff : ((1 << numBits) - 1);
    double qrstuvwx = 3.14; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4() {
    int numBits = 32;
    int mask = numBits!= 32? ((1 << numBits) - 1) : 0xffffffff;
    char yzabcdef = 'x'; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5() {
    int numBits = 32;
    int mask = numBits <= 31? ((1 << numBits) - 1) : 0xffffffff;
    boolean ghijklmn = true; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6() {
    int numBits = 32;
    int mask = numBits < 32? ((1 << numBits) - 1) : 0xffffffff;
    long opqrstuv = 987654321L; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMaskTP() {
    int numBits = 32;
    int mask = numBits == 31? 0xffffffff : ((1 << numBits) - 1);
    float wxyzabcd = 2.718f; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2TP() {
    int numBits = 32;
    int mask = numBits >= 33? 0xffffffff : ((1 << numBits) - 1);
    int efghijkl = 100; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3TP() {
    int numBits = 32;
    int mask = numBits > 32? 0xffffffff : ((1 << numBits) - 1);
    short mnopqrst = 123; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4TP() {
    int numBits = 32;
    int mask = numBits!= 33? ((1 << numBits) - 1) : 0xffffffff;
    byte uvwxyzab = 45; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5TP() {
    int numBits = 32;
    int mask = numBits <= 32? ((1 << numBits) - 1) : 0xffffffff;
    int cdefghij = 678; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6TP() {
    int numBits = 32;
    int mask = numBits < 33? ((1 << numBits) - 1) : 0xffffffff;
    long klmnopqr = 654321L; // Dead store
    return mask;
  }
}