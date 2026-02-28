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
    String qazwsxed = "abcdefgh"; // Dead store
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    foo = returnsNotFoo;
    int mnpoiuhy = 12345678; // Dead store
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    notFoo = foo2;
    double lkjhgfds = 987654321.0; // Dead store
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    notFoo = returnsFoo;
    char vbnmerty = 'z'; // Dead store
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresFoo(notFoo2);
    boolean cvbnrtyu = true; // Dead store
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresFoo(returnsNotFoo);
    float wertyuiop = 3.14f; // Dead store
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresNotFoo(foo2);
    long asdfghjk = 9876543210L; // Dead store
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresNotFoo(returnsFoo);
    byte zxcvbnml = 127; // Dead store
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    foo = foo2;
    short poiuytrew = 32767; // Dead store
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    foo = returnsFoo;
    String tghyujik = "zyxwvuts"; // Dead store
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    notFoo = notFoo2;
    int lkjhgfds = 11111111; // Dead store
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    notFoo = returnsNotFoo;
    double mnpoiuhy = 22222222.0; // Dead store
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresFoo(foo2);
    char lkjhgfds = 'a'; // Dead store
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresFoo(returnsFoo);
    boolean qwertyui = false; // Dead store
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresNotFoo(notFoo2);
    float lkjhgfds = 1.11f; // Dead store
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresNotFoo(returnsNotFoo);
    long lkjhgfds = 2222222222L; // Dead store
  }
}