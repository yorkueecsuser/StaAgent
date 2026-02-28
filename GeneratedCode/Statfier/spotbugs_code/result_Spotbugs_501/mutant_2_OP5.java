import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}