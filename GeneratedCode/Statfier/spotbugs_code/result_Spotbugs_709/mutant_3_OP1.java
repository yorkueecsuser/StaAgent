class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    String abcdefgh = "unused"; // Dead store mutation
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    int hijklmno = 42; // Dead store mutation
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    boolean pqrstuvw = true; // Dead store mutation
    return result;
  }
}