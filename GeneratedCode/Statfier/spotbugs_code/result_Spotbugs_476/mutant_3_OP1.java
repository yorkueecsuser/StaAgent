class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    // Dead Store Mutation
    int hijklmno = 42;
  }
}