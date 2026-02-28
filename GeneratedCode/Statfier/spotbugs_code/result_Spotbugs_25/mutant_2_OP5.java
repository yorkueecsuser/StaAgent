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

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        i = 100; // This case is unreachable
        break;
      case false:
        j = 200; // This case is also unreachable
        break;
    }

    return i + j + k;
  }

  private boolean getAlwaysFalse() {
    return false; // This method ensures the switch condition is dynamically determined but always false
  }
}