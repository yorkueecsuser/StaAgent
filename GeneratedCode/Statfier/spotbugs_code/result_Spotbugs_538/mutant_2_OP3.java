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
      // Introduced an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
      return o;
    }

    private boolean getUnreachableCondition() {
      return false;
    }
  }
}