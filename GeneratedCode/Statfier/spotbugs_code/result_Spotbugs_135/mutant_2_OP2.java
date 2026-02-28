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
      // Duplicate the parameter for mutation
      @Nonnull String theParameterDuplicate = theParameter;
    }
  }

  public interface FindBugsParameterChecking {
    public void doSomething(@CheckForNull String theParameter);
  }

  public static class FindBugsParameterCheckingImpl implements FindBugsParameterChecking {
    @Override
    public void doSomething(@Nonnull String theParameter) {
      // do something
      // Duplicate the parameter for mutation
      @Nonnull String theParameterDuplicate = theParameter;
    }
  }
}