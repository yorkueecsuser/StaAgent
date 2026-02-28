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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never execute because the if condition is always false
        System.out.println("This is another unreachable block");
      }
      return o;
    }

    private boolean getCondition() {
      // Always returns false, making the if-else branches unreachable
      return false;
    }
  }
}