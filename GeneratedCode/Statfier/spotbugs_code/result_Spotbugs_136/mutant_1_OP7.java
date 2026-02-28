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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return x.hashCode();
    }

    public int bar() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return foo("abc");
    }

    private boolean getCondition() {
      return false;
    }
  }
}