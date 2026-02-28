import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {}
    
    // Mutant: Rename 'nc' to 'a'
    int a = 20;
    while (a-- > 0) {}
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;
    }
    
    // Mutant: Rename 'nc' to 'b'
    int b = 20;
    while (b > 0) {
      b--;
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static String convertToString(int val, int len) {
    StringBuilder sb = new StringBuilder();
    sb.append(val);
    int dataLen = sb.length();
    if (dataLen < len) {
      for (int i = dataLen; i < len; i++) {
        sb.insert(0, 0);
      }
    } else if (dataLen > len) {
      sb.delete(0, dataLen - len);
    }
    return sb.toString();
    
    // Mutant: Rename'sb' to 'c'
    StringBuilder c = new StringBuilder();
    c.append(val);
    int x = c.length();
    if (x < len) {
      for (int y = x; y < len; y++) {
        c.insert(0, 0);
      }
    } else if (x > len) {
      c.delete(0, x - len);
    }
    return c.toString();
  }
}