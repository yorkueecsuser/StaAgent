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
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      e.x = 2; // This line will never be executed because shouldRun is always false
    } else {
      e.x = 3; // This line will also never be executed because shouldRun is always false
    }

    e.x = 1;
    return e;
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the if-else block unreachable
  }
}