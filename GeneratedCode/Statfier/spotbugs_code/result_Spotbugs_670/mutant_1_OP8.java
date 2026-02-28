import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_07_13 {

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask() {
    int numBits = 32;
    int mask = numBits == 32? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMaskA() {
    int a = 32;
    int mask = a == 32? 0xffffffff : ((1 << a) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2() {
    int numBits = 32;
    int mask = numBits >= 32? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2B() {
    int b = 32;
    int mask = b >= 32? 0xffffffff : ((1 << b) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3() {
    int numBits = 32;
    int mask = numBits > 31? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3C() {
    int c = 32;
    int mask = c > 31? 0xffffffff : ((1 << c) - 1);
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4() {
    int numBits = 32;
    int mask = numBits!= 32? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4D() {
    int d = 32;
    int mask = d!= 32? ((1 << d) - 1) : 0xffffffff;
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5() {
    int numBits = 32;
    int mask = numBits <= 31? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5E() {
    int e = 32;
    int mask = e <= 31? ((1 << e) - 1) : 0xffffffff;
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6() {
    int numBits = 32;
    int mask = numBits < 32? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6F() {
    int f = 32;
    int mask = f < 32? ((1 << f) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMaskTP() {
    int numBits = 32;
    int mask = numBits == 31? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMaskTPG() {
    int g = 32;
    int mask = g == 31? 0xffffffff : ((1 << g) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2TP() {
    int numBits = 32;
    int mask = numBits >= 33? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask2TPH() {
    int h = 32;
    int mask = h >= 33? 0xffffffff : ((1 << h) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3TP() {
    int numBits = 32;
    int mask = numBits > 32? 0xffffffff : ((1 << numBits) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask3TPI() {
    int i = 32;
    int mask = i > 32? 0xffffffff : ((1 << i) - 1);
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4TP() {
    int numBits = 32;
    int mask = numBits!= 33? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask4TPJ() {
    int j = 32;
    int mask = j!= 33? ((1 << j) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5TP() {
    int numBits = 32;
    int mask = numBits <= 32? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask5TPK() {
    int k = 32;
    int mask = k <= 32? ((1 << k) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6TP() {
    int numBits = 32;
    int mask = numBits < 33? ((1 << numBits) - 1) : 0xffffffff;
    return mask;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  static int getMask6TPL() {
    int l = 32;
    int mask = l < 33? ((1 << l) - 1) : 0xffffffff;
    return mask;
  }
}