import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DoNotReport {

  int mFld;

  // normally we would report this, but we won't because com.racerd.donotreport is block listed in
  //.inferconfig
  void obviousRaceBad(int i) {
    mFld = i;

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      mFld = mFld + 1;
    }
  }

  private boolean getCondition() {
    return false;
  }
}