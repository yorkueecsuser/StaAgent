import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1921523 {
  public @CheckForNull Integer nullablePerhaps(int x) {
    return x % 2 == 0? null : x;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @CheckForNull Integer nullableAlways(int x) {
    return null;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @CheckForNull Integer nullableNever(int x) {
    return 7;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @NonNull Integer nonNullIndirectPerhaps(int x) {
    return nullablePerhaps(x);
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @NonNull Integer nonNullIndirectAlways(int x) {
    return nullableAlways(x);
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @NonNull Integer nonNullIndirectNever(int x) {
    return nullableNever(x);
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @NonNull Integer nonNullPerhaps(int x) {
    return (x % 2 == 0? null : x);
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public @NonNull Integer nonNullAlways(int x) {
    return null;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  public String deadGiveavay(int x) {
    return (x % 2 == 0? null : x).toString();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}