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
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
  }

  // Mutated code
  public @Foo(when = When.NEVER) Object notBar;

  public @Foo(when = When.ALWAYS) Object bar;

  public @Foo(when = When.NEVER) Object returnsNotBar() {
    return null;
  }
  ;

  public @Foo(when = When.ALWAYS) Object returnsBar() {
    return null;
  }
  ;

  public void requiresNotBar(@Foo(when = When.NEVER) Object x) {}
  ;

  public void requiresBar(@Foo(when = When.ALWAYS) Object x) {}
  ;

  @ExpectWarning("TQ")
  public void test13() {
    bar = notBar;
  }

  @ExpectWarning("TQ")
  public void test33() {
    bar = returnsNotBar();
  }

  @ExpectWarning("TQ")
  public void test22() {
    notBar = bar;
  }

  @ExpectWarning("TQ")
  public void test42() {
    notBar = returnsBar();
  }

  @ExpectWarning("TQ")
  public void test17() {
    requiresBar(notBar);
  }

  @ExpectWarning("TQ")
  public void test37() {
    requiresBar(returnsNotBar());
  }

  @ExpectWarning("TQ")
  public void test26() {
    requiresNotBar(bar);
  }

  @ExpectWarning("TQ")
  public void test46() {
    requiresNotBar(returnsBar());
  }

  @NoWarning("TQ")
  public void ok23() {
    bar = bar;
  }

  @NoWarning("TQ")
  public void ok43() {
    bar = returnsBar();
  }

  @NoWarning("TQ")
  public void ok12() {
    notBar = notBar;
  }

  @NoWarning("TQ")
  public void ok32() {
    notBar = returnsNotBar();
  }

  @NoWarning("TQ")
  public void ok27() {
    requiresBar(bar);
  }

  @NoWarning("TQ")
  public void ok47() {
    requiresBar(returnsBar());
  }

  @NoWarning("TQ")
  public void ok16() {
    requiresNotBar(notBar);
  }

  @NoWarning("TQ")
  public void ok36() {
    requiresNotBar(returnsNotBar());
  }
}