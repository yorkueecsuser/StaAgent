import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_07_13 {

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask() {
    int numBits = 32;
    int mask = numBits == 32? 0xffffffff : ((1 << numBits) - 1);
    int qwertyui; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2() {
    int numBits = 32;
    int mask = numBits >= 32? 0xffffffff : ((1 << numBits) - 1);
    int asdfghjk; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3() {
    int numBits = 32;
    int mask = numBits > 31? 0xffffffff : ((1 << numBits) - 1);
    int zxcvbnm; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4() {
    int numBits = 32;
    int mask = numBits!= 32? ((1 << numBits) - 1) : 0xffffffff;
    int poiuytrew; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5() {
    int numBits = 32;
    int mask = numBits <= 31? ((1 << numBits) - 1) : 0xffffffff;
    int lkjhgfdsa; // Dead store
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6() {
    int numBits = 32;
    int mask = numBits < 32? ((1 << numBits) - 1) : 0xffffffff;
    int mnbvcxz; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMaskTP() {
    int numBits = 32;
    int mask = numBits == 31? 0xffffffff : ((1 << numBits) - 1);
    int vbnm; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2TP() {
    int numBits = 32;
    int mask = numBits >= 33? 0xffffffff : ((1 << numBits) - 1);
    int cvbnm; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3TP() {
    int numBits = 32;
    int mask = numBits > 32? 0xffffffff : ((1 << numBits) - 1);
    int bnm; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4TP() {
    int numBits = 32;
    int mask = numBits!= 33? ((1 << numBits) - 1) : 0xffffffff;
    int nm; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5TP() {
    int numBits = 32;
    int mask = numBits <= 32? ((1 << numBits) - 1) : 0xffffffff;
    int m; // Dead store
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6TP() {
    int numBits = 32;
    int mask = numBits < 33? ((1 << numBits) - 1) : 0xffffffff;
    int xcvbnm; // Dead store
    return mask;
  }
}