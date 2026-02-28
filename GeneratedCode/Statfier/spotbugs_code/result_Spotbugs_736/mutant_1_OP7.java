class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }

    for (i = 0; i < a; i++) System.err.println(i);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}