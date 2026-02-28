import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooUnknownSource {

  int f(@NeverFoo String c) {
    return c.hashCode();
  }

  int g(@Foo String x) {
    return x.hashCode();
  }

  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String y) {
    return f(y); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String z) {
    return g(z); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String a) {
    return f(a); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String b) {
    return g(b); // should generate a warning here
  }
}