import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return null;
  }

  public String deadGiveavay(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return (x % 2 == 0? null : x).toString();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}