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
      boolean condition = getCondition();
      if (condition) {
        // unreachable code
        System.out.println("This is an unreachable statement in GenericFindBugsParameterCheckingImpl");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  public interface FindBugsParameterChecking {
    public void doSomething(@CheckForNull String theParameter);
  }

  public static class FindBugsParameterCheckingImpl implements FindBugsParameterChecking {
    @Override
    public void doSomething(@Nonnull String theParameter) {
      // do something
      boolean condition = getCondition();
      if (condition) {
        // unreachable code
        System.out.println("This is an unreachable statement in FindBugsParameterCheckingImpl");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}