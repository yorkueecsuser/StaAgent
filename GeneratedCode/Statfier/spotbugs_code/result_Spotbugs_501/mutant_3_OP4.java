import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}