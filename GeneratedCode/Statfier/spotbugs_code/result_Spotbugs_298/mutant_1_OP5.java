import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        System.out.println("This is the reachable case.");
        break;
    }
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        System.out.println("This is the reachable case.");
        break;
    }
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        System.out.println("This is the reachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}