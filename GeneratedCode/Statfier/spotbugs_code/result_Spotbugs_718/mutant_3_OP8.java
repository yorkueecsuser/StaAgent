class NullDeref {

  private int x;

  public static void main(String[] argv) {
    NullDeref n = new NullDeref();

    String s = "foo";
    n = null;

    if (null == n) System.out.println("This is silly");

    if (n == null) {
      System.out.println("Hey yo, it's null");
      System.out.println("Bad idea: " + n.x);
    } else {
      System.out.println("Safe to deref here: " + n.x);
      s = null;
    }

    // s can't be null
    int i = s.hashCode();
    s = null;

    if (argv.length > 1) System.out.println("argv.length > 1");
    else System.out.println("argv.length <= 1");

    // We should catch this one:
    int j = s.hashCode();

    s = argv[0];

    if (s == null) System.out.println("s is null");

    // at this point we know s is null on some
    // simple path

    if (argv.length > 2) System.out.println("argv.length > 2");
    else System.out.println("argv.length <= 2");

    // at this point we don't know anything about the
    // state of s

    // won't generate a warning here. Might be nice if we did
    int k = s.hashCode();

    // Mutant code starts here
    String t = "bar";
    t = null;

    if (null == t) System.out.println("This is another silly test");

    if (t == null) {
      System.out.println("Hey yo, it's also null");
      System.out.println("Another bad idea: " + t.length());
    } else {
      System.out.println("Safe to deref here: " + t.length());
      t = "baz";
    }

    // t can't be null
    int m = t.hashCode();
    t = null;

    if (argv.length > 1) System.out.println("argv.length > 1 in mutant");
    else System.out.println("argv.length <= 1 in mutant");

    // We should catch this one in mutant:
    int p = t.hashCode();

    t = argv[0];

    if (t == null) System.out.println("t is null in mutant");

    // at this point we know t is null on some
    // simple path

    if (argv.length > 2) System.out.println("argv.length > 2 in mutant");
    else System.out.println("argv.length <= 2 in mutant");

    // at this point we don't know anything about the
    // state of t

    // won't generate a warning here. Might be nice if we did
    int q = t.hashCode();
  }
}