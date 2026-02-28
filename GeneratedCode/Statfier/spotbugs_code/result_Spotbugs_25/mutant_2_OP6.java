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

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }

    return i + j + k;
  }

  // Method to provide a dynamic condition that will be false
  private boolean getCondition() {
    return false;
  }
}