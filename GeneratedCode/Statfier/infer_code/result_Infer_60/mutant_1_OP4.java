import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DoNotReport {

  int mFld;

  // normally we would report this, but we won't because com.racerd.donotreport is block listed in
  //.inferconfig
  void obviousRaceBad(int i) {
    mFld = i;

    // Introduced mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      mFld += 10;
    } else {
      // This block will also never execute because shouldRun is always false
      mFld -= 10;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}