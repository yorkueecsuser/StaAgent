import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    int abcdabcd; // Dead store
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    String efghijkl; // Dead store
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    boolean mnopqrst; // Dead store
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    double uvwxyzab; // Dead store
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    char cdefghij; // Dead store
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    float klmnopqr; // Dead store
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    long stuvwxyz; // Dead store
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    short abcdefgh; // Dead store
    return null;
  }

  public String deadGiveavay(int x) {
    byte ijklmnop; // Dead store
    return (x % 2 == 0? null : x).toString();
  }
}