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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This is an unreachable if block");
      } else {
        // Some alternative code that should also never run
        System.out.println("This is an unreachable else block");
      }
      return x.hashCode();
    }

    public int bar() {
      return foo("abc");
    }

    private boolean getCondition() {
      // This method ensures the condition is dynamically determined at runtime
      return false;
    }
  }
}