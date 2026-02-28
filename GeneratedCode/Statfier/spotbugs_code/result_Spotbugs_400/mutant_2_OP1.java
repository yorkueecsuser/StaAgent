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
    String abcdefgh = "unusedVariable";
  }

  @ExpectWarning("EC")
  public static void test1(String[] args, Object[] o, String[] s) {
    if (args.equals(args)) System.out.println("args.equals(args)");
    // Dead Store Mutation
    int hijklmno = 42;
  }

  @ExpectWarning("EC")
  public static void test2(String[] args, Object[] o, String[] s) {
    if (o.equals(args)) System.out.println("o.equals(args)");
    // Dead Store Mutation
    boolean pqrstuvw = true;
  }

  @ExpectWarning("EC")
  public static void test3(String[] args, Object[] o, String[] s) {
    if (s.equals(args)) System.out.println("s.equals(args)");
    // Dead Store Mutation
    double xyzabcde = 3.14;
  }

  @ExpectWarning("EC")
  public static void test4(String[] args, Object[] o, String[] s) {
    if (args.equals("test")) System.out.println("FOund test");
    // Dead Store Mutation
    char fghijklm = 'x';
  }

  @ExpectWarning("EC")
  public static void test5(String[] args, Object[] o, String[] s) {
    if ("test".equals(args)) System.out.println("Found test 2");
    // Dead Store Mutation
    long nopqrstu = 987654321L;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, Object[] b) {
    return a.equals(b);
    // Dead Store Mutation
    float vwxyzabc = 2.718f;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, long[] b) {
    return a.equals(b);
    // Dead Store Mutation
    short defghijk = 123;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, String b) {
    return a.equals(b);
    // Dead Store Mutation
    byte lmnopqrs = 10;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, int[][] b) {
    return a.equals(b);
    // Dead Store Mutation
    int tuvwxyzA = 567;
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, double[] b) {
    return a.equals(b);
    // Dead Store Mutation
    long BcdEfGhI = 654321;
  }
}