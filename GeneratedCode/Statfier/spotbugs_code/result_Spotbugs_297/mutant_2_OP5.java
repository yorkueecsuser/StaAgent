import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

public abstract class TestInterprocedural {
  @Foo Object fooField;

  public void setFoo(@Foo Object o) {
    fooField = o;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  public @Foo Object getFoo() {
    return fooField;
  }

  protected abstract void requireFoo(@Foo Object obj);

  @Foo(when = When.NEVER)
  protected abstract Object notFoo();

  // Requires a value that is always Foo,
  // but is not annotated as such.
  @NoWarning("TQ")
  protected void requiresFooButNotAnnotatedAsSuch(Object o) {
    requireFoo(o);
  }

  // Returns a value that is notFoo,
  // but does not have any direct annotations.
  @NoWarning("TQ")
  public Object g() {
    return notFoo();
  }

  @ExpectWarning("TQ")
  public void report1() {
    Object notFoo = g();
    fooField = notFoo;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    Object notFoo = notFoo();
    requiresFooButNotAnnotatedAsSuch(notFoo);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is never true
    return false;
  }
}