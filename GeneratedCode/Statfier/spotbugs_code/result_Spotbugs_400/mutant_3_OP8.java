import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadEquals {
  public static void main(String args[]) {
    Object x[] = new Object[args.length]; // Renamed 'o' to 'x'
    String y[] = new String[args.length]; // Renamed's' to 'y'
    for (int i = 0; i < args.length; i++) x[i] = y[i] = args[i];
    test1(args, x, y);
    test2(args, x, y);
    test3(args, x, y);
    test4(args, x, y);
    test5(args, x, y);
  }

  @ExpectWarning("EC")
  public static void test1(String[] args, Object[] o, String[] s) {
    if (args.equals(args)) System.out.println("args.equals(args)");
  }

  @ExpectWarning("EC")
  public static void test2(String[] args, Object[] o, String[] s) {
    if (o.equals(args)) System.out.println("o.equals(args)");
  }

  @ExpectWarning("EC")
  public static void test3(String[] args, Object[] o, String[] s) {
    if (s.equals(args)) System.out.println("s.equals(args)");
  }

  @ExpectWarning("EC")
  public static void test4(String[] args, Object[] o, String[] s) {
    if (args.equals("test")) System.out.println("FOund test");
  }

  @ExpectWarning("EC")
  public static void test5(String[] args, Object[] o, String[] s) {
    if ("test".equals(args)) System.out.println("Found test 2");
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, Object[] b) {
    return a.equals(b);
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, long[] c) { // Renamed 'b' to 'c'
    return a.equals(c);
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, String d) { // Renamed 'b' to 'd'
    return a.equals(d);
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, int[][] e) { // Renamed 'b' to 'e'
    return a.equals(e);
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, double[] f) { // Renamed 'b' to 'f'
    return a.equals(f);
  }
}