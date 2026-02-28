import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    return x % 2 == 0? null : x;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x + 1;
    } else {
      return x - 1;
    }
  }

  public @CheckForNull Integer nullableAlways(int x) {
    return null;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x;
    } else {
      return x + 1;
    }
  }

  public @CheckForNull Integer nullableNever(int x) {
    return 7;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x * 2;
    } else {
      return x / 2;
    }
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    return nullablePerhaps(x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x + 2;
    } else {
      return x - 2;
    }
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    return nullableAlways(x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x;
    } else {
      return x + 2;
    }
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    return nullableNever(x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x * 3;
    } else {
      return x / 3;
    }
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    return (x % 2 == 0? null : x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x + 3;
    } else {
      return x - 3;
    }
  }

  public @NonNull Integer nonNullAlways(int x) {
    return null;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return x;
    } else {
      return x + 3;
    }
  }

  public String deadGiveavay(int x) {
    return (x % 2 == 0? null : x).toString();
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    } else {
      return "Still Unreachable";
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }
}