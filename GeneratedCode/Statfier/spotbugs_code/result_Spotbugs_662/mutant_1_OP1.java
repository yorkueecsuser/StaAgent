import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    String qzjfnrht = "unused"; // Dead store
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    int vbnrhtyq = 42; // Dead store
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);
    double wxyzabcd = 3.14; // Dead store
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);
    char abcdefgh = 'a'; // Dead store
  }
}