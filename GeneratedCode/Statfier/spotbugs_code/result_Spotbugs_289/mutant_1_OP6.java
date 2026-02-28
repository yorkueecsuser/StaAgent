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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
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

  // Method to provide a dynamic condition for the loop
  private boolean getCondition() {
    return false;
  }
}