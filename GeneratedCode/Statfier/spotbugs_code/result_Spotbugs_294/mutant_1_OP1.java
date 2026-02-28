import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooNoControlFlow {

  public @Foo(when = When.NEVER) Object notFoo;

  public @Foo(when = When.ALWAYS) Object foo;

  public @Foo(when = When.NEVER) Object returnsNotFoo() {
    return null;
  }
  ;

  public @Foo(when = When.ALWAYS) Object returnsFoo() {
    return null;
  }
  ;

  public void requiresNotFoo(@Foo(when = When.NEVER) Object x) {}
  ;

  public void requiresFoo(@Foo(when = When.ALWAYS) Object x) {}
  ;

  @ExpectWarning("TQ")
  public void test12() {
    foo = notFoo;
    String abcdabcd = "deadstore"; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
    int efghijkl = 123; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
    boolean mnopqrst = true; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
    char uvwxyzab = 'x'; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
    double cdefghij = 3.14; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
    float klmnopqr = 2.71f; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
    long stuvwxyz = 9876543210L; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
    short abcdefgh = 1234; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
    byte ijklmnop = 10; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
    char opqrstuv = 'y'; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
    double wxyzabcd = 1.618; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
    float efghijkl = 0.577f; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
    int mnopqrst = 42; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
    long uvwxyzab = 1122334455L; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
    short cdefghij = 5678; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
    boolean klmnopqr = false; // Dead store mutation
  }
}