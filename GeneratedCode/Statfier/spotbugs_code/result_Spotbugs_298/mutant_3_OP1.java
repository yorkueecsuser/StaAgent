import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
    String qvwjfnxy = "unusedVariable";
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
    int kxqzvbnr = 42;
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
    boolean jhtyfrdx = true;
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
    double wplmfnrz = 3.14;
  }
}