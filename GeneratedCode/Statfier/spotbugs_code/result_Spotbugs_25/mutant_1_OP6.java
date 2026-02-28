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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int loopVar = 0; conditionFor; loopVar++) {
      // This loop is unreachable because conditionFor is never set to true
      System.out.println("This loop should never execute");
    }

    return i + j + k;
  }

  private boolean getCondition() {
    return false;
  }
}