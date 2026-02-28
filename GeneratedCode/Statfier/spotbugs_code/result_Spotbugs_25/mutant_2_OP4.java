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

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      i = 999;
    } else {
      // This block is also intended to be unreachable
      j = 888;
    }

    return i + j + k;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the blocks remain unreachable
  }
}