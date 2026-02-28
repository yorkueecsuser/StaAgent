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

    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        System.out.println("This is also unreachable.");
        break;
    }

    return i + j + k;
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the switch statement unreachable
  }
}