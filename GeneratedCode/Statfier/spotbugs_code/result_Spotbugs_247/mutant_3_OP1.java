import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
    }
    // Dead Store Mutation
    String jxqfzrvt = "unusedVariable";
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
    // Dead Store Mutation
    int vbnrhtyx = 42;
  }

  public static void main2() {
    test2((Object[]) null);
    // Dead Store Mutation
    boolean qzjfnrht = true;
  }
}