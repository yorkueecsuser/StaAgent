import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
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

  // Mutated code
  void f(@NonNull Object y) {}

  int h(Object y) {
    return y.hashCode();
  }

  @NonNull Object g;

  void testDirectDereference(Object y) {
    y.hashCode();
  }

  void testPassedToParameterAnnotationNonnull(Object y) {
    f(y);
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object y) {
    f(y);
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object y) {
    return y;
  }

  void testAssignedToNonNullField(Object y) {
    this.g = y;
  }
}