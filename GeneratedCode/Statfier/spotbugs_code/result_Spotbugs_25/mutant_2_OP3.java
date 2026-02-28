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

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      x = "unreachable";
      j = f(x);
    }

    return i + j + k;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}