import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

public abstract class TestInterprocedural {
  @Foo Object fooField;

  public void setFoo(@Foo Object o) {
    fooField = o;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    Object notFoo = notFoo();
    requiresFooButNotAnnotatedAsSuch(notFoo);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // In a real scenario, this would return a dynamic condition
  }
}