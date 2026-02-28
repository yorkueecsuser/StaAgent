class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    args = myArgs; // Duplicate assignment
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    staticArgs = myArgs; // Duplicate assignment
  }
}