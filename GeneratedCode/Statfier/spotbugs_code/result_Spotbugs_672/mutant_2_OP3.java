import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooUnknownSource {

  int f(@NeverFoo String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in f method.");
    }
    return c.hashCode();
  }

  int g(@Foo String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in g method.");
    }
    return c.hashCode();
  }

  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in unannotatedSourceToNeverSinkFalsePositive method.");
    }
    return f(c); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in unannotatedSourceToAlwaysSinkFalsePositive method.");
    }
    return g(c); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in unknownSourceToNeverSinkFalsePositive method.");
    }
    return f(c); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in unknownSourceToNeverSourceFalsePositive method.");
    }
    return g(c); // should generate a warning here
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}