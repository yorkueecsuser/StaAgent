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
  public void a(@SlashedClassName String b) {}

  public void c(@DottedClassName String d) {}

  @ExpectWarning("TQ")
  public void e() {
    a("foo.Bar");
  }

  @NoWarning("TQ")
  public void f() {
    a("foo/Bar");
  }

  @NoWarning("TQ")
  public void g() {
    c("foo.Bar");
  }

  @ExpectWarning("TQ")
  public void h() {
    c("foo/Bar");
  }
}