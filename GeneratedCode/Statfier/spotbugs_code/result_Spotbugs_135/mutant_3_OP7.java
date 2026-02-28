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
      
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
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
      
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
    
    private boolean getCondition() {
        return false;
    }
  }
}