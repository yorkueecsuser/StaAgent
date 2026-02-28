import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    x.hashCode();
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    f(x);
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    f(x);
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    return x;
  }

  void testAssignedToNonNullField(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might execute if condition is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    this.f = x;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}