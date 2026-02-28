class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    return result;
  }

  int f2(Object x) {
    int b = 0; // Mutated variable'result' to 'b'
    if (x!= null) b = 1;
    b += x.hashCode();
    return b;
  }

  int f3(Object x) {
    int c; // Mutated variable'result' to 'c'
    if (x == null) c = x.hashCode();
    else c = x.hashCode();
    return c;
  }
}