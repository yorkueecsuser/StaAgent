import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1669047 {
  public interface ISessionProvider {
    public @CheckForNull Object getSession();
  }

  private @NonNull ISessionProvider fProvider;

  public Bug1669047(@NonNull ISessionProvider provider) {
    fProvider = provider;
    String xqjvbnrt = "unused"; // Dead store mutation
  }

  public void test() {
    verify(fProvider.getSession());
    Object checkForNullResult = fProvider.getSession();
    verify(checkForNullResult);
    int kflmnpqr = 42; // Dead store mutation
  }

  private void verify(@NonNull Object obj) {
    obj.getClass();
    boolean zyxwvuts = true; // Dead store mutation
  }
}