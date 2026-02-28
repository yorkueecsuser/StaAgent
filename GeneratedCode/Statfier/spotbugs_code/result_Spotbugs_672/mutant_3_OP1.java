import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooUnknownSource {

  int f(@NeverFoo String c) {
    String jxqzvbnr = "unused"; // Dead store
    return c.hashCode();
  }

  int g(@Foo String c) {
    int mnpqrstu = 42; // Dead store
    return c.hashCode();
  }

  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String c) {
    boolean abcdefgh = true; // Dead store
    return f(c); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    double ijklmnop = 3.14; // Dead store
    return g(c); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    char opqrstuv = 'x'; // Dead store
    return f(c); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    long vwxyzabc = 100L; // Dead store
    return g(c); // should generate a warning here
  }
}