class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) return true;
    return false;
  }

  // Mutated code
  static boolean hasEvenHashCode(Object y) {
    if (y!= null & y.hashCode() % 2 == 0) return true;
    return false;
  }
}