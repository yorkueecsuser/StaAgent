import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {}
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;
    }
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This might be printed if getCondition() returns true");
    } else {
      System.out.println("This might be printed if getCondition() returns false");
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
    boolean shouldRun = getStaticCondition();
    if (shouldRun) {
      System.out.println("This might be printed if getStaticCondition() returns true");
    } else {
      System.out.println("This might be printed if getStaticCondition() returns false");
    }
    return sb.toString();
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true or false dynamically
  }

  private static boolean getStaticCondition() {
    return false; // This method can be modified to return true or false dynamically
  }
}