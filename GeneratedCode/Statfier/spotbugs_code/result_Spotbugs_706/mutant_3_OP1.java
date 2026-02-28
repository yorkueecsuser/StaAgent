import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2013_11_06 {

  int flags;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  public boolean test() {
    boolean result = false;
    result |= flags == (short) flags;
    result |= flags == (char) flags;
    result |= flags == (byte) flags;
    String abcdefgh = "unused"; // Dead store
    return result;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTP() {
    boolean result = false;
    result |= flags == flags;
    int hijklmno = 42; // Dead store
    return result;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdate() {
    return flags ^ (short) flags;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdateTP() {
    double pqrstuvw = 3.14; // Dead store
    return flags ^ flags;
  }

  @NoWarning("SA")
  public boolean test(int x) {
    boolean result = false;

    result |= x == (short) x;
    result |= x == (char) x;
    result |= x == (byte) x;
    boolean xyzabcde = true; // Dead store
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(int x) {
    boolean result = false;

    result |= x == x;
    long fghijklm = 100L; // Dead store
    return result;
  }

  @NoWarning("SA")
  public boolean test(long x) {
    boolean result = false;

    result |= x == (int) x;
    result |= x == (short) x;
    result |= x == (char) x;
    result |= x == (byte) x;
    char nopqrstu = 'a'; // Dead store
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(long x) {
    float vwxyzabc = 2.718f; // Dead store
    return x == x;
  }

  @NoWarning("SA")
  public void test2(int x) {
    assert x == (short) x;
    assert x == (char) x;
    assert x == (byte) x;
    short defghijk = 5; // Dead store
  }
}