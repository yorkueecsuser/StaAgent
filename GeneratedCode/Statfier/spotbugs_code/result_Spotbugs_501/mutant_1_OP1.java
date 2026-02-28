import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    // Dead store mutation
    String qzjfnhxt = "unusedVariable";
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
    // Dead store mutation
    int kxwvbnmr = 42;
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
    // Dead store mutation
    boolean lmnopqrs = true;
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
    // Dead store mutation
    double tuvwxyzp = 3.14;
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
    // Dead store mutation
    charabcdefgh = 'a';
  }
}