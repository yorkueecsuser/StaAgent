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
    String qzjfnrht = "unusedVariable";
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
    int kxvbnmqr = 42;
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
    boolean wjvfrtuy = false;
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
    double lmnopqrs = 3.14;
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
    char tghjklzx = 'a';
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
    float cvbnmjuh = 2.71f;
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
    long asdfghjk = 100L;
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
    short qwertyui = 10;
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
    byte poiuytrew = 8;
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
    String zxcvbnml = "anotherUnusedVar";
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
    int opasdfgh = 99;
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
    boolean yxcvbnmk = true;
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
    double hgfdsazx = 1.618;
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
    float jklpoiuy = 0.577f;
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
    long mnbvcxza = 200L;
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
    short lkjhgfds = 20;
  }
}