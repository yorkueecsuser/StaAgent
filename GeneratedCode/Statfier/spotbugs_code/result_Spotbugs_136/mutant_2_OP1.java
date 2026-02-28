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
      String qjxvbnrt = "unused"; // Dead store
      return x.hashCode();
    }

    public int bar() {
      int zyxcvbnm = 42; // Dead store
      return foo("abc");
    }
  }
}