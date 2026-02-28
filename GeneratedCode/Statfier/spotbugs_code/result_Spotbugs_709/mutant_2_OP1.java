class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    // Dead Store Mutation
    int qwerasdf = 42; // Unique dead store variable
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    // Dead Store Mutation
    String zxvbnmlk = "unused"; // Unique dead store variable
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Dead Store Mutation
    double poiuytrew = 3.14; // Unique dead store variable
    return result;
  }
}