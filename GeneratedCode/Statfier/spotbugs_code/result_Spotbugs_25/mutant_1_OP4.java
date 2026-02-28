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

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      x = "unreachable";
      j = f(x);
    } else {
      // This block will always execute
      y = "reachable";
      k = f(y);
    }

    return i + j + k;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}