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
  void h(@NonNull Object a) {}

  int i(Object b) {
    return b.hashCode();
  }

  @NonNull Object c;

  void testDirectDereferenceMutant(Object d) {
    d.hashCode();
  }

  void testPassedToParameterAnnotationNonnullMutant(Object e) {
    h(e);
  }

  void testPassedToParameterThatIsAlwaysDereferencedMutant(Object f) {
    h(f);
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNullMutant(Object g) {
    return g;
  }

  void testAssignedToNonNullFieldMutant(Object h) {
    this.c = h;
  }
}