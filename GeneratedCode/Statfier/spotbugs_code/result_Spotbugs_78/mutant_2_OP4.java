// Based on code from org.apache.tools.zip.ZipEntry
class UnconditionalDerefFalsePositive {
  int x;

  UnconditionalDerefFalsePositive(int x) {
    this.x = x;
  }

  @Override
  public Object clone() {
    UnconditionalDerefFalsePositive e = null;
    try {
      e = (UnconditionalDerefFalsePositive) super.clone();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      e.x = 1;
    } else {
      // This branch is unreachable because getCondition() will always return false
      e.x = 2;
    }
    
    return e;
  }

  private boolean getCondition() {
    // Always returns false to ensure the else branch is unreachable
    return false;
  }
}