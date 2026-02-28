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
    return result;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTP() {
    boolean result = false;
    result |= flags == flags;
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
    result |= x == (char) x;
    result |= x == (byte) x;
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(int x) {
    boolean result = false;

    result |= x == x;
    return result;
  }

  @NoWarning("SA")
  public boolean test(long x) {
    boolean result = false;

    result |= x == (int) x;
    result |= x == (short) x;
    result |= x == (char) x;
    result |= x == (byte) x;
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(long x) {
    return x == x;
  }

  @NoWarning("SA")
  public void test2(int x) {
    assert x == (short) x;
    assert x == (char) x;
    assert x == (byte) x;
  }

  // Mutated code
  @NoWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testb() {
    boolean b = false;
    b |= flags == (short) flags;
    b |= flags == (char) flags;
    b |= flags == (byte) flags;
    return b;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTPc() {
    boolean c = false;
    c |= flags == flags;
    return c;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdated() {
    return flags ^ (short) flags;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdateTPe() {
    return flags ^ flags;
  }

  @NoWarning("SA")
  public boolean testf(int f) {
    boolean g = false;

    g |= f == (short) f;
    g |= f == (char) f;
    g |= f == (byte) f;
    return g;
  }

  @ExpectWarning("SA")
  public boolean testTPh(int h) {
    boolean i = false;

    i |= h == h;
    return i;
  }

  @NoWarning("SA")
  public boolean testj(long j) {
    boolean k = false;

    k |= j == (int) j;
    k |= j == (short) j;
    k |= j == (char) j;
    k |= j == (byte) j;
    return k;
  }

  @ExpectWarning("SA")
  public boolean testTPL(long l) {
    return l == l;
  }

  @NoWarning("SA")
  public void test2m(int m) {
    assert m == (short) m;
    assert m == (char) m;
    assert m == (byte) m;
  }
}