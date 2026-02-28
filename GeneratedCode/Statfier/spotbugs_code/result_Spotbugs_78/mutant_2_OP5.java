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
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        e.x = 2; // This will never be executed
        break;
      default:
        e.x = 1; // This will always be executed
        break;
    }
    
    return e;
  }

  private boolean getAlwaysFalse() {
    return false; // This method ensures the switch condition is always false
  }
}