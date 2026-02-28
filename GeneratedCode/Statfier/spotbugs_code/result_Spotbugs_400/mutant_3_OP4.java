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
  }

  @ExpectWarning("EC")
  public static void test1(String[] args, Object[] o, String[] s) {
    if (args.equals(args)) System.out.println("args.equals(args)");
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public static void test2(String[] args, Object[] o, String[] s) {
    if (o.equals(args)) System.out.println("o.equals(args)");
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public static void test3(String[] args, Object[] o, String[] s) {
    if (s.equals(args)) System.out.println("s.equals(args)");
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public static void test4(String[] args, Object[] o, String[] s) {
    if (args.equals("test")) System.out.println("FOund test");
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public static void test5(String[] args, Object[] o, String[] s) {
    if ("test".equals(args)) System.out.println("Found test 2");
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, Object[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, long[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, String b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, int[][] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("EC")
  public boolean b(int[] a, double[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}