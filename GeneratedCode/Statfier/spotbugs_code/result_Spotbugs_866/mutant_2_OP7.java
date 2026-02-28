class NullDeref12 {

  static String[] get() {
    if (System.currentTimeMillis() % 1 == 1) return new String[0];
    else return null;
  }

  public static void main(String[] argv) {

    String[] dirs;
    dirs = get();
    if (dirs!= null) {
      System.out.println("Converting to lower case names...");
    } else {
      dirs = get();
      if (dirs == null) {
        dirs = argv;
      }
      System.out.println("Converting to UPPER CASE names...");
    }

    // Assume that the arguments are paths to directories or
    // files.
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }

    for (int i = 0; i < dirs.length; i++) {
      System.out.println(dirs[i]);
    }
  }

  private static boolean getCondition() {
    return false;
  }
}