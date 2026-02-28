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
    int result = f(c); // should not generate a warning here
    int resultCopy = f(c); // Mutant: duplicated assignment
    return result;
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    int result = g(c); // should not generate a warning here
    int resultCopy = g(c); // Mutant: duplicated assignment
    return result;
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    int result = f(c); // should generate a warning here
    int resultCopy = f(c); // Mutant: duplicated assignment
    return result;
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    int result = g(c); // should generate a warning here
    int resultCopy = g(c); // Mutant: duplicated assignment
    return result;
  }
}