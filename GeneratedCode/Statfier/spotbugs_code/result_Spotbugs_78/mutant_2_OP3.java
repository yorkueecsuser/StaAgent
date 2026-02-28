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
    
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      e.x = 2;
    }
    
    e.x = 1;
    return e;
  }

  private boolean getCondition() {
    // Always return false to make the if block unreachable
    return false;
  }
}