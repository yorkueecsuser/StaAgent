import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
    String yzqjfnrj = "unusedVariable"; // Dead Store
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
    int wvbnkxqp = 42; // Dead Store
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
    boolean lhtpmcjd = true; // Dead Store
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
    double kxzfmrwt = 3.14; // Dead Store
  }
}