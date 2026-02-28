import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadEquals {
  public static void main(String args[]) {
    Object o[] = new Object[args.length];
    String s[] = new String[args.length];
    for (int i = 0; i < args.length; i++) o[i] = s[i] = args[i];
    test1(args, o, s);
    test2(args, o, s);
    test3(args, o, s);
    test4(args, o, s);
    test5(args, o, s);
    // Dead Store Mutation
    String kjhfgvbn = "unusedVariable";
  }

  @ExpectWarning("EC")
  public static void test1(String[] args, Object[] o, String[] s) {
    if (args.equals(args)) System.out.println("args.equals(args)");
    // Dead Store Mutation
    int qwerasdf = 42;
  }

  @ExpectWarning("EC")
  public static void test2(String[] args, Object[] o, String[] s) {
    if (o.equals(args)) System.out.println("o.equals(args)");
    // Dead Store Mutation
    boolean zxcvbnml = true;
  }

  @ExpectWarning("EC")
  public static void test3(String[] args, Object[] o, String[] s) {
    if (s.equals(args)) System.out.println("s.equals(args)");
    // Dead Store Mutation
    char poiuytrew = 'x';
  }

  @ExpectWarning("EC")
  public static void test4(String[] args, Object[] o, String[] s) {
    if (args.equals("test")) System.out.println("FOund test");
    // Dead Store Mutation
    float lmnopqrs = 3.14f;
  }

  @ExpectWarning("EC")
  public static void test5(String[] args, Object[] o, String[] s) {
    if ("test".equals(args)) System.out.println("Found test 2");
    // Dead Store Mutation
    double wertyuio = 2.718;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, Object[] b) {
    return a.equals(b);
    // Dead Store Mutation
    long abcdefgh = 987654321;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, long[] b) {
    return a.equals(b);
    // Dead Store Mutation
    short hijklmno = 12345;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, String b) {
    return a.equals(b);
    // Dead Store Mutation
    byte pqrstuvw = 100;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, int[][] b) {
    return a.equals(b);
    // Dead Store Mutation
    double xyzabcde = 1.618;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, double[] b) {
    return a.equals(b);
    // Dead Store Mutation
    boolean fghijklm = false;
  }
}