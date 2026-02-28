import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return null;
  }

  public String deadGiveavay(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return (x % 2 == 0? null : x).toString();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}