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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    verify(fProvider.getSession());
    Object checkForNullResult = fProvider.getSession();
    verify(checkForNullResult);
  }

  private void verify(@NonNull Object obj) {
    obj.getClass();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but returns false
  }
}