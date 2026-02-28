import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    needsSlashedClassname("foo.Bar");
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    needsSlashedClassname("foo/Bar");
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    needsDottedClassname("foo.Bar");
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    needsDottedClassname("foo/Bar");
  }

  private boolean getCondition() {
    return false;
  }
}