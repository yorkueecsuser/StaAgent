import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3567801 {

  interface Test {
    int foo(@CheckForNull Object x);
  }

  static class Impl implements Test {

    @Override
    @NoWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public int foo(@Nonnull Object x) {
      Object y = x;  // Introduced local variable y and assigned x to it
      Object y2 = y; // Duplicated assignment of y
      return x.hashCode();
    }

    public int bar() {
      return foo("abc");
    }
  }
}