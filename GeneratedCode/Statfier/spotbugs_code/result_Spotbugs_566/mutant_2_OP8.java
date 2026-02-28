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

  public @NonNull Integer nonNullIndirectPerhaps(int a) {
    return nullablePerhaps(a);
  }

  public @NonNull Integer nonNullIndirectAlways(int b) {
    return nullableAlways(b);
  }

  public @NonNull Integer nonNullIndirectNever(int c) {
    return nullableNever(c);
  }

  public @NonNull Integer nonNullPerhaps(int d) {
    return (d % 2 == 0? null : d);
  }

  public @NonNull Integer nonNullAlways(int e) {
    return null;
  }

  public String deadGiveavay(int f) {
    return (f % 2 == 0? null : f).toString();
  }
}