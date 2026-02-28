import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
      // Mutant: Duplicate the assignment statement (though there isn't an explicit assignment here, we duplicate the loop variable usage)
      System.err.println(x); // This line is duplicated to adhere to the mutation operator description
    }
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
  }

  public static void main2() {
    test2((Object[]) null);
    // Mutant: No explicit assignment to duplicate, but we can duplicate the method call
    test2((Object[]) null); // This line is duplicated to adhere to the mutation operator description
  }
}