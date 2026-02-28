class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    return result;
  }

  // Mutant 1: Renamed'result' to 'a'
  int f_mutant1(Object x) {
    int a = 0;
    if (x == null) a = 1;
    a += x.hashCode();
    return a;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    return result;
  }

  // Mutant 2: Renamed'result' to 'b'
  int f2_mutant2(Object x) {
    int b = 0;
    if (x!= null) b = 1;
    b += x.hashCode();
    return b;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    return result;
  }

  // Mutant 3: Renamed'result' to 'c'
  int f3_mutant3(Object x) {
    int c;
    if (x == null) c = x.hashCode();
    else c = x.hashCode();
    return c;
  }
}