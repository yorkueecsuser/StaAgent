import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable
        System.out.println("This is an unreachable block in bug1");
      }
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable
        System.out.println("This is an unreachable block in bug2");
      }
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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
          // This block is unreachable
          System.out.println("This is an unreachable block in convertToString");
        }
      }
    } else if (dataLen > len) {
      sb.delete(0, dataLen - len);
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable
        System.out.println("This is an unreachable block in convertToString");
      }
    }
    return sb.toString();
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if blocks unreachable
  }
}