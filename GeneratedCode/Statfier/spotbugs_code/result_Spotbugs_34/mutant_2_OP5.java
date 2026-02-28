import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2857782 {
  @NoWarning("IL_INFINITE_LOOP")
  public void bug1() {
    int nc = 20;
    while (nc-- > 0) {}

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public void bug2() {
    int nc = 20;
    while (nc > 0) {
      nc--;

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case will always be executed
          System.out.println("Reachable case 1");
          break;
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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case will never be executed because condition is always false
            System.out.println("Unreachable case 0");
            break;
          case 1:
            // This case will always be executed
            System.out.println("Reachable case 1");
            break;
        }
      }
    } else if (dataLen > len) {
      sb.delete(0, dataLen - len);

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case will always be executed
          System.out.println("Reachable case 1");
          break;
      }
    }
    return sb.toString();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}