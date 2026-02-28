import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    // Dead store mutation
    int qzjfnvxy = 42;
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    // Dead store mutation
    long vbnrhtyq = 123L;
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);
    // Dead store mutation
    boolean kldfjgpo = false;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);
    // Dead store mutation
    char jxwvbnrt = 'a';
  }
}