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
    return f(c); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    return g(c); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    return f(c); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    return g(c); // should generate a warning here
  }

  // Mutated code
  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String x) {
    return f(x); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String y) {
    return g(y); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String z) {
    return f(z); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String w) {
    return g(w); // should generate a warning here
  }
}