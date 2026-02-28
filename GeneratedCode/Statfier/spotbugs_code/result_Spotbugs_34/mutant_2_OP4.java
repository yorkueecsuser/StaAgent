import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {}

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block in bug1");
    } else {
      // This block will always be executed
      System.out.println("This is the reachable block in bug1");
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;
    }

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block in bug2");
    } else {
      // This block will always be executed
      System.out.println("This is the reachable block in bug2");
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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block in convertToString");
    } else {
      // This block will always be executed
      System.out.println("This is the reachable block in convertToString");
    }

    return sb.toString();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}