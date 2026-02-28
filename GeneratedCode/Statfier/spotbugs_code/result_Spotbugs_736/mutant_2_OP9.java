class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    i = 0;
    do {
      System.err.println(i);
      i++;
    } while (i < a);
  }
}