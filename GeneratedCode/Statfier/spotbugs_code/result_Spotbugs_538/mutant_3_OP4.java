import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3431688 {

  public interface MyInterface {
    @Nonnull
    Object foo(@CheckForNull Object o);
  }

  public static class MyImplementation implements MyInterface {
    @Override
    @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public Object foo(Object o) {
      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
      }
      return o;
    }

    private boolean getCondition() {
      // Always return false to ensure the if block is unreachable
      return false;
    }
  }
}