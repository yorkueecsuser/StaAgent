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
  void f(@NonNull Object a) {}

  int g(Object b) {
    return b.hashCode();
  }

  @NonNull Object c;

  void testDirectDereference(Object d) {
    d.hashCode();
  }

  void testPassedToParameterAnnotationNonnull(Object e) {
    f(e);
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object f) {
    f(f);
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object g) {
    return g;
  }

  void testAssignedToNonNullField(Object h) {
    this.c = h;
  }
}