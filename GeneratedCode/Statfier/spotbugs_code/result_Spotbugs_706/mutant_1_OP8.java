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
  int a;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  public boolean b() {
    boolean c = false;
    c |= a == (short) a;
    c |= a == (char) a;
    c |= a == (byte) a;
    return c;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean d() {
    boolean e = false;
    e |= a == a;
    return e;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int f() {
    return a ^ (short) a;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int g() {
    return a ^ a;
  }

  @NoWarning("SA")
  public boolean h(int i) {
    boolean j = false;

    j |= i == (short) i;
    j |= i == (char) i;
    j |= i == (byte) i;
    return j;
  }

  @ExpectWarning("SA")
  public boolean k(int i) {
    boolean l = false;

    l |= i == i;
    return l;
  }

  @NoWarning("SA")
  public boolean m(long n) {
    boolean o = false;

    o |= n == (int) n;
    o |= n == (short) n;
    o |= n == (char) n;
    o |= n == (byte) n;
    return o;
  }

  @ExpectWarning("SA")
  public boolean p(long n) {
    return n == n;
  }

  @NoWarning("SA")
  public void q(int r) {
    assert r == (short) r;
    assert r == (char) r;
    assert r == (byte) r;
  }
}