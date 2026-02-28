import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    int qjfnvzxt = 42; // Dead store
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    String ykhtgraw = "unused"; // Dead store
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    boolean bzxvqpmn = true; // Dead store
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    char cdfgtrhn = 'a'; // Dead store
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    double dfgthyuj = 3.14; // Dead store
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    long lghjklmn = 123456789L; // Dead store
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    float fltqweas = 2.71f; // Dead store
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    short shrtzxcv = 10; // Dead store
    return null;
  }

  public String deadGiveavay(int x) {
    byte btymnbvc = 8; // Dead store
    return (x % 2 == 0? null : x).toString();
  }
}