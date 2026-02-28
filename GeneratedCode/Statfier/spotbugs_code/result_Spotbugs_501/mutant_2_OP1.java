import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {}

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    String qvbnrhty = "unused"; // Dead store
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
    int wjxkzcvb = 42; // Dead store
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
    double plmnoert = 3.14; // Dead store
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
    boolean asdfghjk = true; // Dead store
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
    char zxcvbnml = 'a'; // Dead store
  }
}