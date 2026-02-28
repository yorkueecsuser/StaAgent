class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    boolean isNotNull = x!= null;
    boolean isNotNullCopy = x!= null; // Duplicated assignment
    if (isNotNull & x.hashCode() % 2 == 0) return true;
    return false;
  }
}