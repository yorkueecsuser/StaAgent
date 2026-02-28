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
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable block");
        return -1;
      } else {
        // This block will also never execute because the if condition is always false
        System.out.println("This is another unreachable block");
        return -2;
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      // This method always returns false, making the if-else block unreachable
      return false;
    }

    public int bar() {
      return foo("abc");
    }
  }
}