import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooSimpleControlFlow {

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

  boolean b;

  public Object unknown;

  @ExpectWarning("TQ")
  public void test12() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    foo = notFoo2;
    String qvbnrhty = "deadstore"; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    foo = returnsNotFoo;
    int xwvfrtgb = 42; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    notFoo = foo2;
    boolean zxcvbnml = true; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    notFoo = returnsFoo;
    double asdfghjk = 3.14; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresFoo(notFoo2);
    char poiuytrewq = 'a'; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresFoo(returnsNotFoo);
    float lkjhgfdsa = 2.71f; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresNotFoo(foo2);
    long mnbvcxzas = 987654321L; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresNotFoo(returnsFoo);
    short qwertyuiop = 1234; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    foo = foo2;
    byte asdfghjkl = 10; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    foo = returnsFoo;
    String tyuioplkjh = "anotherdeadstore"; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    notFoo = notFoo2;
    int poiuytrewq = 5678; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    notFoo = returnsNotFoo;
    double lkjhgfdsa = 1.618; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresFoo(foo2);
    boolean zxcvbnml = false; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresFoo(returnsFoo);
    char mnbvcxz = 'b'; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresNotFoo(notFoo2);
    float qwertyuiop = 0.577f; // Dead store mutation
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresNotFoo(returnsNotFoo);
    long asdfghjkl = 123456789L; // Dead store mutation
  }
}