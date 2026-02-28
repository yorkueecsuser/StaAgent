class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    // Dead store mutation
    int ijklmnop = 42;
  }
}