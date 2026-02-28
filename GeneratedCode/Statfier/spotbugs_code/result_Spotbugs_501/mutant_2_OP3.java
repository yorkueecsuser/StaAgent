import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}