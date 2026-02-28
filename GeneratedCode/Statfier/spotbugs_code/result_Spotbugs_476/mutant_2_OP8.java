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
  private String[] b; // Renamed 'args' to 'b'
  private static String[] c; // Renamed'staticArgs' to 'c'

  public Bug2436026(String... z) { // Renamed'myArgs' to 'z'
    b = z;
  }

  public static void setStatic(String... x) { // Renamed'myArgs' to 'x'
    c = x;
  }
}