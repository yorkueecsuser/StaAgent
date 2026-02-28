class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result = 0; // Mutant: duplicated assignment without method invocation
    result += x.hashCode();
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result = 0; // Mutant: duplicated assignment without method invocation
    result += x.hashCode();
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    result = 0; // Mutant: duplicated assignment without method invocation
    return result;
  }
}