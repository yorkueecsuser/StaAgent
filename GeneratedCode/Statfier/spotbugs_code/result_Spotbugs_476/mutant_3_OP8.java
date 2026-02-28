class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
  }

  // Mutated code
  private String[] b;
  private static String[] c;

  public Bug2436026(String... z) {
    b = z;
  }

  public static void setStatic(String... x) {
    c = x;
  }
}