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
      switch(condition) {
        case true:
          // This case is reachable
          break;
        default:
          // This case is unreachable because getCondition() will never return false
          break;
      }
      return x.hashCode();
    }

    public int bar() {
      return foo("abc");
    }

    private boolean getCondition() {
      // This method always returns true, making the 'default' case in the switch statement unreachable
      return true;
    }
  }
}