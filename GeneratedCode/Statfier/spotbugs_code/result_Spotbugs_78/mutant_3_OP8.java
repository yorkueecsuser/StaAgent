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
    e.x = 1;
    return e;
  }

  // Mutated code with renaming operator
  @Override
  public Object clone() {
    UnconditionalDerefFalsePositive a = null;
    try {
      a = (UnconditionalDerefFalsePositive) super.clone();
    } catch (Exception b) {
      b.printStackTrace();
    }
    a.x = 1;
    return a;
  }
}