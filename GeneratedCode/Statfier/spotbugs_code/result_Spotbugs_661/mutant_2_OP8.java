class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    int a = flags; // mutant variable
    return a ^ a; // expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    int b = flags; // mutant variable
    return b & b; //  expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    int c = flags; // mutant variable
    return c - c; //  expeected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    int d = flags; // mutant variable
    return d | d; //  expeected SA_LOCAL_SELF_COMPUTATION
  }
}