import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
    }
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  private static boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
  }
}