class ParameterNumberingTest {

  int f(Object x) {
    return x.hashCode();
  }

  int g() {
    int i = f(null);
    Object x = null;
    if (i!= 0) x = "hello";
    int j = f(x);
    Object y = null;
    if (i!= 0) y = "bye";
    int k;
    if (j > 0) k = f(y);
    else k = -f(y);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        i = 100;
        break;
      case 1:
        // This is the only reachable case
        j = 200;
        break;
    }

    return i + j + k;
  }

  // Helper method to ensure dynamic determination of the condition
  private boolean getCondition() {
    return false;
  }
}