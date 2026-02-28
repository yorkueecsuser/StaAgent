import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooUnknownSource {

  int f(@NeverFoo String c) {
    return c.hashCode();
  }

  int g(@Foo String c) {
    return c.hashCode();
  }

  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String c) {
    int temp = c.length(); // Added unique assignment statement
    int temp = c.length(); // Duplicate of the above assignment statement
    return f(c); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    int temp = c.length(); // Added unique assignment statement
    int temp = c.length(); // Duplicate of the above assignment statement
    return g(c); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    int temp = c.length(); // Added unique assignment statement
    int temp = c.length(); // Duplicate of the above assignment statement
    return f(c); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    int temp = c.length(); // Added unique assignment statement
    int temp = c.length(); // Duplicate of the above assignment statement
    return g(c); // should generate a warning here
  }
}