import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1669047 {
  public interface ISessionProvider {
    public @CheckForNull Object getSession();
  }

  private @NonNull ISessionProvider fProvider;

  public Bug1669047(@NonNull ISessionProvider provider) {
    fProvider = provider;
  }

  public void test() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    verify(fProvider.getSession());
    Object checkForNullResult = fProvider.getSession();
    verify(checkForNullResult);
  }

  private void verify(@NonNull Object obj) {
    obj.getClass();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}