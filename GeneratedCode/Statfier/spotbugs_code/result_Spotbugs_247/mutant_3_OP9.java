import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    int i = 0;
    do {
      if (i < t.length) {
        Object x = t[i];
        System.err.println(x);
        i++;
      }
    } while (i < t.length);
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
  }
}