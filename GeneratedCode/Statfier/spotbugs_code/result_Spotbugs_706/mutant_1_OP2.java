import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2013_11_06 {

  int flags;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  public boolean test() {
    boolean result = false;
    result |= flags == (short) flags;
    result |= flags == (short) flags; // Mutant
    result |= flags == (char) flags;
    result |= flags == (char) flags; // Mutant
    result |= flags == (byte) flags;
    result |= flags == (byte) flags; // Mutant
    return result;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTP() {
    boolean result = false;
    result |= flags == flags;
    result |= flags == flags; // Mutant
    return result;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdate() {
    return flags ^ (short) flags;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdateTP() {
    return flags ^ flags;
  }

  @NoWarning("SA")
  public boolean test(int x) {
    boolean result = false;

    result |= x == (short) x;
    result |= x == (short) x; // Mutant
    result |= x == (char) x;
    result |= x == (char) x; // Mutant
    result |= x == (byte) x;
    result |= x == (byte) x; // Mutant
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(int x) {
    boolean result = false;

    result |= x == x;
    result |= x == x; // Mutant
    return result;
  }

  @NoWarning("SA")
  public boolean test(long x) {
    boolean result = false;

    result |= x == (int) x;
    result |= x == (int) x; // Mutant
    result |= x == (short) x;
    result |= x == (short) x; // Mutant
    result |= x == (char) x;
    result |= x == (char) x; // Mutant
    result |= x == (byte) x;
    result |= x == (byte) x; // Mutant
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(long x) {
    return x == x;
    // No mutant here as there is no assignment statement without method invocation
  }

  @NoWarning("SA")
  public void test2(int x) {
    assert x == (short) x;
    assert x == (short) x; // Mutant
    assert x == (char) x;
    assert x == (char) x; // Mutant
    assert x == (byte) x;
    assert x == (byte) x; // Mutant
  }
}