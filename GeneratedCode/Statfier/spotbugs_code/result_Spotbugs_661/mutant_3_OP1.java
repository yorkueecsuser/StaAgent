class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    int abcdefgh = 42; // Dead Store
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    String ijklmnop = "unused"; // Dead Store
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    double qrstuvwx = 3.14; // Dead Store
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean yzabcd = true; // Dead Store
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }
}