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

      // Inserting unreachable switch statement
      boolean unreachableCondition = getUnreachableCondition();
      switch(unreachableCondition) {
        case true:
          System.out.println("This is an unreachable switch case.");
          break;
        default:
          System.out.println("This is also unreachable.");
          break;
      }
    }

    // Assume that the arguments are paths to directories or
    // files.
    for (int i = 0; i < dirs.length; i++) {
      System.out.println(dirs[i]);
    }
  }

  // Method to provide a dynamically determined false condition
  private static boolean getUnreachableCondition() {
    return System.currentTimeMillis() < 0; // This will always be false
  }
}