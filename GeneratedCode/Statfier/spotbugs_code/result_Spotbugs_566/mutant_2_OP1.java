import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    int qzjfnvxy = 42; // Dead Store
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    String wvbnrhty = "unused"; // Dead Store
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    double lmkgptxz = 3.14; // Dead Store
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    boolean jxqfctvy = true; // Dead Store
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    char vbnrhtyx = 'a'; // Dead Store
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    long nmlkpgzx = 123456789L; // Dead Store
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    float yxqvfbnj = 2.718f; // Dead Store
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    short zxvbnrht = 10; // Dead Store
    return null;
  }

  public String deadGiveavay(int x) {
    byte qzjfnvxy = 8; // Dead Store
    return (x % 2 == 0? null : x).toString();
  }
}