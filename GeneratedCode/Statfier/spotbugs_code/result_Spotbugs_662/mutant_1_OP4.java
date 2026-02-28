import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Introduced unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      x = x + 1; // This branch is unreachable
    } else {
      x = x - 1; // This branch will execute
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Introduced unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      y = y + 1; // This branch is unreachable
    } else {
      y = y - 1; // This branch will execute
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);

    // Introduced unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      return true; // This branch is unreachable
    } else {
      return false; // This branch will execute
    }
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);

    // Introduced unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      return 1; // This branch is unreachable
    } else {
      return -1; // This branch will execute
    }
  }
}