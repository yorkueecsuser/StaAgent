import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
    }
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
  }

  // Mutated code
  @NoWarning("NP")
  static void test2(@Nullable Object... q) {
    for (Object y : q) {
      System.err.println(y);
    }
  }

  public static void main(String[] z) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
  }
}