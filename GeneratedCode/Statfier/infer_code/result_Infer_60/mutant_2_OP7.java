import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DoNotReport {

  int mFld;

  // normally we would report this, but we won't because com.racerd.donotreport is block listed in
  //.inferconfig
  void obviousRaceBad(int i) {
    mFld = i;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable at runtime
  }
}