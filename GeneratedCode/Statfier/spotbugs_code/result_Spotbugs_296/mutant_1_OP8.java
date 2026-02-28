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
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    foo = returnsNotFoo;
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    notFoo = foo2;
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    notFoo = returnsFoo;
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresFoo(notFoo2);
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresFoo(returnsNotFoo);
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresNotFoo(foo2);
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresNotFoo(returnsFoo);
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    foo = foo2;
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    foo = returnsFoo;
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    notFoo = notFoo2;
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    notFoo = returnsNotFoo;
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresFoo(foo2);
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresFoo(returnsFoo);
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresNotFoo(notFoo2);
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresNotFoo(returnsNotFoo);
  }

  // Mutated methods
  @ExpectWarning("TQ")
  public void test12_mutation() {
    Object a = notFoo;
    if (b) a = unknown;
    foo = a;
  }

  @ExpectWarning("TQ")
  public void test32_mutation() {
    Object c = returnsNotFoo();
    if (b) c = unknown;
    foo = c;
  }

  @ExpectWarning("TQ")
  public void test21_mutation() {
    Object d = foo;
    if (b) d = unknown;
    notFoo = d;
  }

  @ExpectWarning("TQ")
  public void test41_mutation() {
    Object e = returnsFoo();
    if (b) e = unknown;
    notFoo = e;
  }

  @ExpectWarning("TQ")
  public void test16_mutation() {
    Object f = notFoo;
    if (b) f = unknown;
    requiresFoo(f);
  }

  @ExpectWarning("TQ")
  public void test36_mutation() {
    Object g = returnsNotFoo();
    if (b) g = unknown;
    requiresFoo(g);
  }

  @ExpectWarning("TQ")
  public void test25_mutation() {
    Object h = foo;
    if (b) h = unknown;
    requiresNotFoo(h);
  }

  @ExpectWarning("TQ")
  public void test45_mutation() {
    Object i = returnsFoo();
    if (b) i = unknown;
    requiresNotFoo(i);
  }

  @NoWarning("TQ")
  public void ok22_mutation() {
    Object j = foo;
    if (b) j = unknown;
    foo = j;
  }

  @NoWarning("TQ")
  public void ok42_mutation() {
    Object k = returnsFoo();
    if (b) k = unknown;
    foo = k;
  }

  @NoWarning("TQ")
  public void ok11_mutation() {
    Object l = notFoo;
    if (b) l = unknown;
    notFoo = l;
  }

  @NoWarning("TQ")
  public void ok31_mutation() {
    Object m = returnsNotFoo();
    if (b) m = unknown;
    notFoo = m;
  }

  @NoWarning("TQ")
  public void ok26_mutation() {
    Object n = foo;
    if (b) n = unknown;
    requiresFoo(n);
  }

  @NoWarning("TQ")
  public void ok46_mutation() {
    Object o = returnsFoo();
    if (b) o = unknown;
    requiresFoo(o);
  }

  @NoWarning("TQ")
  public void ok15_mutation() {
    Object p = notFoo;
    if (b) p = unknown;
    requiresNotFoo(p);
  }

  @NoWarning("TQ")
  public void ok35_mutation() {
    Object q = returnsNotFoo();
    if (b) q = unknown;
    requiresNotFoo(q);
  }
}