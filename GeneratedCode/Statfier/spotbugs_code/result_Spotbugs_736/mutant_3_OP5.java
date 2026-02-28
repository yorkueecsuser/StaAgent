class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }

    for (i = 0; i < a; i++) System.err.println(i);
  }

  // Method to return a constant false value
  private static boolean getAlwaysFalse() {
    return false;
  }
}