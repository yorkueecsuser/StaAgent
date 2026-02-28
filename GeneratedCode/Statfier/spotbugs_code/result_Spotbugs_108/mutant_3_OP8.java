import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class BIT_SIGNED_CHECK {

  static final long HIGH_LONG = 0x8000000000000000L;

  static final int HIGH_INT = 0x80000000;

  static final int LOW = 0x1;

  static final int MEDIUM_INT = 0x10000000;

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(long x) {
    if ((x & HIGH_LONG) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(long x) {
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(long x) {
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(long x) {
    if ((x & LOW) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(long x) {
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(int a) {
    if ((a & HIGH_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(int a) {
    if ((a & HIGH_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(int a) {
    if ((a & HIGH_INT) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(int a) {
    if ((a & HIGH_INT) > 0) return true;
    return false;
  }

  // / MEDIUM

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGT(int b) {
    if ((b & MEDIUM_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGE(int b) {
    if ((b & MEDIUM_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLT(int b) {
    if ((b & MEDIUM_INT) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLE(int b) {
    if ((b & MEDIUM_INT) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(int c) {
    if ((c & ~MEDIUM_INT) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(long c) {
    if ((c & ~MEDIUM_INT) > 0) return true;
    return false;
  }

  // / LOW

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(int d) {
    if ((d & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(int d) {
    if ((d & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(int d) {
    if ((d & LOW) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(int d) {
    if ((d & LOW) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(int e) {
    if ((e & ~LOW) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(long e) {
    if ((e & ~LOW) > 0) return true;
    return false;
  }
}