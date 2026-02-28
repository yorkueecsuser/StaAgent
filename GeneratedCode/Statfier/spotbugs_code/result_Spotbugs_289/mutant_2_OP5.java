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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case.");
        break;
    }
  }

  // Method to simulate a dynamic condition
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