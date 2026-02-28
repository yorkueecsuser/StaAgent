import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Ideas_2012_11_28<T> {

  public void doit(@CheckForNull T t) {}

  static class Subclass extends Ideas_2012_11_28<String> {

    @Override
    @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public void doit(String s) {
      System.out.println(s.hashCode());

      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run because shouldRun is always false.");
      } else {
        System.out.println("This will also never run because shouldRun is always false.");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always returns false
    }
  }
}