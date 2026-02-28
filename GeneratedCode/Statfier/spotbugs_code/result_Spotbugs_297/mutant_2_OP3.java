import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

public abstract class TestInterprocedural {
  @Foo Object fooField;

  public void setFoo(@Foo Object o) {
    fooField = o;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
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
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is another unreachable statement.");
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
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("Yet another unreachable statement.");
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    Object notFoo = notFoo();
    requiresFooButNotAnnotatedAsSuch(notFoo);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("And one more unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but returns false
  }
}