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

      // Inserting an unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable
        System.out.println("This will never be printed");
      }
    }

    // Assume that the arguments are paths to directories or
    // files.
    for (int i = 0; i < dirs.length; i++) {
      System.out.println(dirs[i]);
    }
  }

  // Method to provide a dynamically determined but always false condition
  private static boolean getUnreachableCondition() {
    return System.currentTimeMillis() < 0; // This condition is always false
  }
}