import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    Integer result = x % 2 == 0? null : x;
    Integer resultCopy = x % 2 == 0? null : x; // Duplicate assignment
    return result;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    Integer result = null;
    Integer resultCopy = null; // Duplicate assignment
    return result;
  }

  public @CheckForNull Integer nullableNever(int x) {
    Integer result = 7;
    Integer resultCopy = 7; // Duplicate assignment
    return result;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    Integer result = nullablePerhaps(x);
    Integer resultCopy = nullablePerhaps(x); // Duplicate assignment
    return result;
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    Integer result = nullableAlways(x);
    Integer resultCopy = nullableAlways(x); // Duplicate assignment
    return result;
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    Integer result = nullableNever(x);
    Integer resultCopy = nullableNever(x); // Duplicate assignment
    return result;
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    Integer result = (x % 2 == 0? null : x);
    Integer resultCopy = (x % 2 == 0? null : x); // Duplicate assignment
    return result;
  }

  public @NonNull Integer nonNullAlways(int x) {
    Integer result = null;
    Integer resultCopy = null; // Duplicate assignment
    return result;
  }

  public String deadGiveavay(int x) {
    return (x % 2 == 0? null : x).toString();
  }
}