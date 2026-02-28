class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }

    for (i = 0; i < a; i++) System.err.println(i);
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}