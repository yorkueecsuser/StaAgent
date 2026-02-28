import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DoNotReport {

  int mFld;

  // normally we would report this, but we won't because com.racerd.donotreport is block listed in
  //.inferconfig
  void obviousRaceBad(int i) {
    mFld = i;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      mFld = 0;
    } else {
      // This block will also never execute
      mFld = 1;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}