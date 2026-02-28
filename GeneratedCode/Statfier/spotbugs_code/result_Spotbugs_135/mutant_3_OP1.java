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
      String xjvqfnrt = "unusedVariable"; // Dead Store
    }
  }

  public interface FindBugsParameterChecking {
    public void doSomething(@CheckForNull String theParameter);
  }

  public static class FindBugsParameterCheckingImpl implements FindBugsParameterChecking {
    @Override
    public void doSomething(@Nonnull String theParameter) {
      // do something
      int khtybnmr = 42; // Dead Store
    }
  }
}