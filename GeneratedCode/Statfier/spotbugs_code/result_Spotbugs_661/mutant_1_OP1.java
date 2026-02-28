class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    int abcdefgh = 42; // Dead store
    return flags ^ flags; // expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    String hijklmno = "unused"; // Dead store
    return flags & flags; //  expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    double pqrstuvw = 3.14; // Dead store
    return flags - flags; //  expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean xyzabcde = true; // Dead store
    return flags | flags; //  expeected SA_LOCAL_SELF_COMPUTATION
  }
}