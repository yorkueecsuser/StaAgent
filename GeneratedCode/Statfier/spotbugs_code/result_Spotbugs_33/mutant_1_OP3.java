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

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  private void verify(@NonNull Object obj) {
    obj.getClass();
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}