import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3527825 {
  public interface GenericFindBugsParameterChecking<T> {
    public void doSomething(@CheckForNull T theParameter);
  }

  public static class GenericFindBugsParameterCheckingImpl
      implements GenericFindBugsParameterChecking<String> {
    @Override
    public void doSomething(@Nonnull String theParameter) {
      // do something
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  public interface FindBugsParameterChecking {
    public void doSomething(@CheckForNull String theParameter);
  }

  public static class FindBugsParameterCheckingImpl implements FindBugsParameterChecking {
    @Override
    public void doSomething(@Nonnull String theParameter) {
      // do something
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}