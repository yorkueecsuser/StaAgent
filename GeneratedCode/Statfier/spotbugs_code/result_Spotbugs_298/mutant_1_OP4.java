import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for testFooDotBarAsSlashedClassName");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for testFooDotBarAsSlashedClassName");
    }
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for testFooSlashBarAsSlashedClassName");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for testFooSlashBarAsSlashedClassName");
    }
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for testFooDotBarAsDottedClassName");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for testFooDotBarAsDottedClassName");
    }
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for testFooSlashBarAsDottedClassName");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for testFooSlashBarAsDottedClassName");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}