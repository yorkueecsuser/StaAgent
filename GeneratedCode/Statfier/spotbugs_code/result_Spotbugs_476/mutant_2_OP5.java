class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}