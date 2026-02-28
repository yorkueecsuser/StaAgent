class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;
    int i_duplicate = 0; // Unique duplicate variable

    i += a;
    i_duplicate += a; // Duplicate assignment statement

    for (i = 0; i < a; i++) System.err.println(i);
  }
}