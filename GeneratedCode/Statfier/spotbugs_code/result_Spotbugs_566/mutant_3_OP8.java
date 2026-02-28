import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int y) {
    return nullablePerhaps(y);
  }

  public @NonNull Integer nonNullIndirectAlways(int z) {
    return nullableAlways(z);
  }

  public @NonNull Integer nonNullIndirectNever(int w) {
    return nullableNever(w);
  }

  public @NonNull Integer nonNullPerhaps(int v) {
    return (v % 2 == 0? null : v);
  }

  public @NonNull Integer nonNullAlways(int u) {
    return null;
  }

  public String deadGiveavay(int t) {
    return (t % 2 == 0? null : t).toString();
  }
}