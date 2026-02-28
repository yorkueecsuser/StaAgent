import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        x = x + 1; // This will never execute
        break;
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        y = y + 1; // This will never execute
        break;
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        return true; // This will never execute
    }
    return false;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        return -1; // This will never execute
    }
    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }
}