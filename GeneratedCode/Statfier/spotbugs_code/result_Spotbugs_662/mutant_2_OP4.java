import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = x + 1; // This branch is unreachable because condition is always false
    } else {
      x = x - 1; // This branch is reachable
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = x + 1; // This branch is unreachable because condition is always false
    } else {
      x = x - 1; // This branch is reachable
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return true; // This branch is unreachable because condition is always false
    } else {
      return false; // This branch is reachable
    }
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return 1; // This branch is unreachable because condition is always false
    } else {
      return -1; // This branch is reachable
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}