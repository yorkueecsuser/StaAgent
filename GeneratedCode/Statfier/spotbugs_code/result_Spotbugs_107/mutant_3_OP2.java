class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) {
      boolean temp = (x!= null & x.hashCode() % 2 == 0); // Duplicate condition
      return true;
    }
    return false;
  }
}