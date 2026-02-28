import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}