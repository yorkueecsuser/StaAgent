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
      String qjvhtyfn = "unusedVariable"; // Dead store
      return x.hashCode();
    }

    public int bar() {
      int zmuxrckw = 42; // Dead store
      return foo("abc");
    }
  }
}