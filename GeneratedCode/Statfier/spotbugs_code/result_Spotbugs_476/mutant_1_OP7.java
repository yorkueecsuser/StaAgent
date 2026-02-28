class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}