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
    verify(fProvider.getSession());
    Object checkForNullResult = fProvider.getSession();
    verify(checkForNullResult);

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because condition is always false
      System.out.println("This is an unreachable else block");
    }
  }

  private void verify(@NonNull Object obj) {
    obj.getClass();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}