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
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed");
      }
      return x.hashCode();
    }

    public int bar() {
      return foo("abc");
    }

    private boolean getCondition() {
      // Always returns false, making the if statement unreachable
      return false;
    }
  }
}