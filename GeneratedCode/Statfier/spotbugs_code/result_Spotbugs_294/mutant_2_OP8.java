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

  // Mutants
  public @Foo(when = When.NEVER) Object a;

  public @Foo(when = When.ALWAYS) Object b;

  public @Foo(when = When.NEVER) Object returnsA() {
    return null;
  }
  ;

  public @Foo(when = When.ALWAYS) Object returnsB() {
    return null;
  }
  ;

  public void requiresNotA(@Foo(when = When.NEVER) Object x) {}
  ;

  public void requiresB(@Foo(when = When.ALWAYS) Object x) {}
  ;

  @ExpectWarning("TQ")
  public void test12b() {
    b = a;
  }

  @ExpectWarning("TQ")
  public void test32b() {
    b = returnsA();
  }

  @ExpectWarning("TQ")
  public void test21b() {
    a = b;
  }

  @ExpectWarning("TQ")
  public void test41b() {
    a = returnsB();
  }

  @ExpectWarning("TQ")
  public void test16b() {
    requiresB(a);
  }

  @ExpectWarning("TQ")
  public void test36b() {
    requiresB(returnsA());
  }

  @ExpectWarning("TQ")
  public void test25b() {
    requiresNotA(b);
  }

  @ExpectWarning("TQ")
  public void test45b() {
    requiresNotA(returnsB());
  }

  @NoWarning("TQ")
  public void ok22b() {
    b = b;
  }

  @NoWarning("TQ")
  public void ok42b() {
    b = returnsB();
  }

  @NoWarning("TQ")
  public void ok11b() {
    a = a;
  }

  @NoWarning("TQ")
  public void ok31b() {
    a = returnsA();
  }

  @NoWarning("TQ")
  public void ok26b() {
    requiresB(b);
  }

  @NoWarning("TQ")
  public void ok46b() {
    requiresB(returnsB());
  }

  @NoWarning("TQ")
  public void ok15b() {
    requiresNotA(a);
  }

  @NoWarning("TQ")
  public void ok35b() {
    requiresNotA(returnsA());
  }
}