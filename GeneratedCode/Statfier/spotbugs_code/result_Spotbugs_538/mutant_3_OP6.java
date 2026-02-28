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
      // Introducing an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop will never execute because conditionFor is always false
      }
      
      return o;
    }

    private boolean getCondition() {
      // This method returns false, ensuring the loop is unreachable
      return false;
    }
  }
}