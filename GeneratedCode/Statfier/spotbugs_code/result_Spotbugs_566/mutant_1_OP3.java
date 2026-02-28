import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return x % 2 == 0? null : x;
  }

  public @CheckForNull Integer nullableAlways(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return null;
  }

  public @CheckForNull Integer nullableNever(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return 7;
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return nullablePerhaps(x);
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return nullableAlways(x);
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return nullableNever(x);
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return (x % 2 == 0? null : x);
  }

  public @NonNull Integer nonNullAlways(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return null;
  }

  public String deadGiveavay(int x) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return (x % 2 == 0? null : x).toString();
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if-statement remains unreachable
  }
}