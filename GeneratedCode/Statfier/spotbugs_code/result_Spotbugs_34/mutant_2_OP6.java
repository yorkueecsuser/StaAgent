import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {}

    // Inserted unreachable for loop
    boolean conditionFor = getConditionForBug1();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;
    }

    // Inserted unreachable for loop
    boolean conditionFor = getConditionForBug2();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
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

    // Inserted unreachable for loop
    boolean conditionFor = getConditionForConvertToString();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }

    return sb.toString();
  }

  // Helper methods to provide dynamic conditions
  private boolean getConditionForBug1() {
    return false; // This method will always return false, making the loop unreachable
  }

  private boolean getConditionForBug2() {
    return false; // This method will always return false, making the loop unreachable
  }

  private static boolean getConditionForConvertToString() {
    return false; // This method will always return false, making the loop unreachable
  }
}