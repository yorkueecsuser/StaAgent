import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooUnknownSource {

  int f(@NeverFoo String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return c.hashCode();
  }

  int g(@Foo String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return c.hashCode();
  }

  @NoWarning("TQ")
  int unannotatedSourceToNeverSinkFalsePositive(String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return f(c); // should not generate a warning here
  }

  @NoWarning("TQ")
  int unannotatedSourceToAlwaysSinkFalsePositive(String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return g(c); // should not generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSinkFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return f(c); // should generate a warning here
  }

  @ExpectWarning("TQ")
  int unknownSourceToNeverSourceFalsePositive(@Foo(when = When.UNKNOWN) String c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
    }
    return g(c); // should generate a warning here
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}