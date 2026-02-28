import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.meta.When;

@DefaultFooParameters
class TestDefaultAnnotations {

  // parameter "o" must carry a @Foo(when=When.ALWAYS) type qualifier,
  // since that is the default for parameters
  public void requiresFoo(Object o) {}

  // violation: @Foo(when=When.NEVER) value passed to method expecting
  // @Foo(when=When.ALWAYS)
  @ExpectWarning("TQ")
  public void violate(@Foo(when = When.NEVER) Object x) {
    requiresFoo(x);
    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This branch is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }

  // @NoWarning("TQ")
  // public void ok(Object x) {
  // requiresFoo(x);
  // }
  //
  // @NoWarning("TQ")
  // public void ok2(@Foo(when=When.ALWAYS) Object x) {
  // requiresFoo(x);
  // }

}