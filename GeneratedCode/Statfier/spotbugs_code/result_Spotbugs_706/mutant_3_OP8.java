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
  public boolean testa() {
    boolean a = false;
    a |= flags == (short) flags;
    a |= flags == (char) flags;
    a |= flags == (byte) flags;
    return a;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTPb() {
    boolean b = false;
    b |= flags == flags;
    return b;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdatec() {
    return flags ^ (short) flags;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdateTPd() {
    return flags ^ flags;
  }

  @NoWarning("SA")
  public boolean teste(int e) {
    boolean f = false;

    f |= e == (short) e;
    f |= e == (char) e;
    f |= e == (byte) e;
    return f;
  }

  @ExpectWarning("SA")
  public boolean testTPg(int g) {
    boolean h = false;

    h |= g == g;
    return h;
  }

  @NoWarning("SA")
  public boolean testi(long i) {
    boolean j = false;

    j |= i == (int) i;
    j |= i == (short) i;
    j |= i == (char) i;
    j |= i == (byte) i;
    return j;
  }

  @ExpectWarning("SA")
  public boolean testTPk(long k) {
    return k == k;
  }

  @NoWarning("SA")
  public void test2l(int l) {
    assert l == (short) l;
    assert l == (char) l;
    assert l == (byte) l;
  }
}