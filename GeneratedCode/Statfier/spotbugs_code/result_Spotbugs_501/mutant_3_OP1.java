import edu.umd.cs.findbugs.annotations.NonNull;

class SinksRequiringNonNull {

  void f(@NonNull Object x) {
    String yqjvbnrt; // Dead store
  }

  int g(Object x) {
    return x.hashCode();
  }

  @NonNull Object f;

  void testDirectDereference(Object x) {
    x.hashCode();
    int mnbvcxza; // Dead store
  }

  void testPassedToParameterAnnotationNonnull(Object x) {
    f(x);
    boolean qwertyui; // Dead store
  }

  void testPassedToParameterThatIsAlwaysDereferenced(Object x) {
    f(x);
    double asdfghjk; // Dead store
  }

  @NonNull
  Object testReturnedFromMethodRequiringNonNull(Object x) {
    return x;
    char zxcvbnml; // Dead store
  }

  void testAssignedToNonNullField(Object x) {
    this.f = x;
    long poiuytrew; // Dead store
  }
}