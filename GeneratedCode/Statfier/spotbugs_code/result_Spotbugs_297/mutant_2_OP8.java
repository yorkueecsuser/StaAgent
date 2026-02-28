import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

public abstract class TestInterprocedural {
  @Foo Object fooField;

  public void setFoo(@Foo Object o) {
    fooField = o;
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
  }

  @ExpectWarning("TQ")
  public void report2() {
    Object notFoo = notFoo();
    requiresFooButNotAnnotatedAsSuch(notFoo);
  }

  // Mutated code
  public void setBar(@Foo Object x) {
    fooField = x;
  }

  public @Foo Object getBar() {
    return fooField;
  }

  @NoWarning("TQ")
  protected void requiresBarButNotAnnotatedAsSuch(Object y) {
    requireFoo(y);
  }

  @NoWarning("TQ")
  public Object h() {
    return notFoo();
  }

  @ExpectWarning("TQ")
  public void report3() {
    Object z = h();
    fooField = z;
  }

  @ExpectWarning("TQ")
  public void report4() {
    Object w = notFoo();
    requiresBarButNotAnnotatedAsSuch(w);
  }
}