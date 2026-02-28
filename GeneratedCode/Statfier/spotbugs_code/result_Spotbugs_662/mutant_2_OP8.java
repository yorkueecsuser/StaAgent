import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    return x;
  }

  // Mutant with renamed variable 'y' to 'a'
  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f_mutant1(int x, int a) {
    if (x < x) x = a ^ a;
    if (x == x) x = a ^ a;
    boolean b = x == x;
    if (x!= x) a = x | x;
    if (x >= x) x = a & a;
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    return x;
  }

  // Mutant with renamed variable 'y' to 'b'
  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f_mutant2(long x, long b) {
    if (x < x) x = b ^ b;
    if (x!= x) b = x | x;
    if (x >= x) x = b & b;
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);
  }

  // Mutant with renamed variable 'y' to 'c'
  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e_mutant1(Object x, Object c) {
    return x.equals(x);
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);
  }

  // Mutant with renamed variable 'y' to 'd'
  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c_mutant1(Integer x, Integer d) {
    return x.compareTo(x);
  }
}