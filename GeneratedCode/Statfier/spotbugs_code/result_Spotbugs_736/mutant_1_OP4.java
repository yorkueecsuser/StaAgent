class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    // Inserting an unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }

    i += a;

    for (i = 0; i < a; i++) System.err.println(i);
  }
}