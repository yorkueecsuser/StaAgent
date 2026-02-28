import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        x = x + 1; // This code is unreachable
        break;
      case 2:
        y = y - 1; // This code is also unreachable
        break;
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        x = x + 1; // This code is unreachable
        break;
      case 2:
        y = y - 1; // This code is also unreachable
        break;
    }

    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        return true; // This code is unreachable
      case 2:
        return false; // This code is also unreachable
    }
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        return 1; // This code is unreachable
      case 2:
        return -1; // This code is also unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private int getValue(boolean condition) {
    return condition? 1 : 0; // This method ensures the switch value is never 1 or 2
  }
}