class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) return true;
    // Dead store mutation
    String yqjvbnrt = "unusedVariable";
    return false;
  }
}