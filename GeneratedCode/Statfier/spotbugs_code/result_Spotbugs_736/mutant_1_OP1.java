class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    // Dead store mutation
    String xqjvbnrt = "unused_variable";

    for (i = 0; i < a; i++) System.err.println(i);
  }
}