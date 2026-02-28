import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestSlashedClassNameValidator {

  public void needsSlashedClassname(@SlashedClassName String name) {}

  public void needsDottedClassname(@DottedClassName String name) {}

  @ExpectWarning("TQ")
  public void testFooDotBarAsSlashedClassName() {
    needsSlashedClassname("foo.Bar");
  }

  @NoWarning("TQ")
  public void testFooSlashBarAsSlashedClassName() {
    needsSlashedClassname("foo/Bar");
  }

  @NoWarning("TQ")
  public void testFooDotBarAsDottedClassName() {
    needsDottedClassname("foo.Bar");
  }

  @ExpectWarning("TQ")
  public void testFooSlashBarAsDottedClassName() {
    needsDottedClassname("foo/Bar");
  }

  // Mutated code
  public void needsSlashedClassname(@SlashedClassName String a) {}

  public void needsDottedClassname(@DottedClassName String b) {}

  @ExpectWarning("TQ")
  public void testXyzDotAbcAsSlashedClassName() {
    needsSlashedClassname("xyz.Abc");
  }

  @NoWarning("TQ")
  public void testXyzSlashAbcAsSlashedClassName() {
    needsSlashedClassname("xyz/Abc");
  }

  @NoWarning("TQ")
  public void testXyzDotAbcAsDottedClassName() {
    needsDottedClassname("xyz.Abc");
  }

  @ExpectWarning("TQ")
  public void testXyzSlashAbcAsDottedClassName() {
    needsDottedClassname("xyz/Abc");
  }
}