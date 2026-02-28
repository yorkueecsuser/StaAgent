import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    do {} while (nc-- > 0);
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    do {
      nc--;
    } while (nc > 0);
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static String convertToString(int val, int len) {
    StringBuilder sb = new StringBuilder();
    sb.append(val);
    int dataLen = sb.length();
    if (dataLen < len) {
      int i = dataLen;
      do {
        sb.insert(0, 0);
        i++;
      } while (i < len);
    } else if (dataLen > len) {
      sb.delete(0, dataLen - len);
    }
    return sb.toString();
  }
}