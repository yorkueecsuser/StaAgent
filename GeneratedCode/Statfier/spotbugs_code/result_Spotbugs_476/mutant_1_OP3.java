class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in the constructor.");
    }
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in the setStatic method.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}