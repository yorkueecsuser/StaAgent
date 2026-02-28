class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    // Dead store mutation
    int jkdhfsaq = 42;
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    // Dead store mutation
    String pqwertyu = "unused";
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Dead store mutation
    boolean zxcvbnml = true;
    return result;
  }
}