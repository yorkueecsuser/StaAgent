class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;

    int i = 0;

    i += a;

    // Dead Store Mutation
    String qzjxtpfn = "unusedVariable";

    for (i = 0; i < a; i++) System.err.println(i);
  }
}