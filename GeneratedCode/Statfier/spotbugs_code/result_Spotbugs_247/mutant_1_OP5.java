import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
    }
    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}