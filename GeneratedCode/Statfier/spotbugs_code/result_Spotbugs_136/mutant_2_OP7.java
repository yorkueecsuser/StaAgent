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
      // Introduced an unreachable while loop with a dynamic condition
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop body is unreachable
        System.out.println("This loop is unreachable");
      }
      return x.hashCode();
    }

    public int bar() {
      // Introduced an unreachable while loop with a dynamic condition
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop body is unreachable
        System.out.println("This loop is unreachable");
      }
      return foo("abc");
    }

    private boolean getCondition() {
      // This method returns a condition that is always false
      return false;
    }
  }
}