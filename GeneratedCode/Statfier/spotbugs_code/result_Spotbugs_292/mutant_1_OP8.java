import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooGuaranteedControlFlow {

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

  boolean b, b2;

  int i;

  public Object unknown;

  @ExpectWarning("TQ")
  public void test12() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    foo = notFoo2;
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    foo = returnsNotFoo;
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    notFoo = foo2;
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    notFoo = returnsFoo;
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    requiresFoo(notFoo2);
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    requiresFoo(returnsNotFoo);
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    requiresNotFoo(foo2);
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    requiresNotFoo(returnsFoo);
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    foo = foo2;
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    foo = returnsFoo;
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    notFoo = notFoo2;
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    notFoo = returnsNotFoo;
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    requiresFoo(foo2);
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    requiresFoo(returnsFoo);
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    requiresNotFoo(notFoo2);
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    requiresNotFoo(returnsNotFoo);
  }

  // Mutated code
  @ExpectWarning("TQ")
  public void test12_mutation() {
    Object a = notFoo;
    if (b) a = unknown;
    if (b2) i++;
    foo = a;
  }

  @ExpectWarning("TQ")
  public void test32_mutation() {
    Object c = returnsNotFoo();
    if (b) c = unknown;
    if (b2) i++;
    foo = c;
  }

  @ExpectWarning("TQ")
  public void test21_mutation() {
    Object d = foo;
    if (b) d = unknown;
    if (b2) i++;
    notFoo = d;
  }

  @ExpectWarning("TQ")
  public void test41_mutation() {
    Object e = returnsFoo();
    if (b) e = unknown;
    if (b2) i++;
    notFoo = e;
  }

  @ExpectWarning("TQ")
  public void test16_mutation() {
    Object f = notFoo;
    if (b) f = unknown;
    if (b2) i++;
    requiresFoo(f);
  }

  @ExpectWarning("TQ")
  public void test36_mutation() {
    Object g = returnsNotFoo();
    if (b) g = unknown;
    if (b2) i++;
    requiresFoo(g);
  }

  @ExpectWarning("TQ")
  public void test25_mutation() {
    Object h = foo;
    if (b) h = unknown;
    if (b2) i++;
    requiresNotFoo(h);
  }

  @ExpectWarning("TQ")
  public void test45_mutation() {
    Object j = returnsFoo();
    if (b) j = unknown;
    if (b2) i++;
    requiresNotFoo(j);
  }

  @NoWarning("TQ")
  public void ok22_mutation() {
    Object k = foo;
    if (b) k = unknown;
    if (b2) i++;
    foo = k;
  }

  @NoWarning("TQ")
  public void ok42_mutation() {
    Object l = returnsFoo();
    if (b) l = unknown;
    if (b2) i++;
    foo = l;
  }

  @NoWarning("TQ")
  public void ok11_mutation() {
    Object m = notFoo;
    if (b) m = unknown;
    if (b2) i++;
    notFoo = m;
  }

  @NoWarning("TQ")
  public void ok31_mutation() {
    Object n = returnsNotFoo();
    if (b) n = unknown;
    if (b2) i++;
    notFoo = n;
  }

  @NoWarning("TQ")
  public void ok26_mutation() {
    Object o = foo;
    if (b) o = unknown;
    if (b2) i++;
    requiresFoo(o);
  }

  @NoWarning("TQ")
  public void ok46_mutation() {
    Object p = returnsFoo();
    if (b) p = unknown;
    if (b2) i++;
    requiresFoo(p);
  }

  @NoWarning("TQ")
  public void ok15_mutation() {
    Object q = notFoo;
    if (b) q = unknown;
    if (b2) i++;
    requiresNotFoo(q);
  }

  @NoWarning("TQ")
  public void ok35_mutation() {
    Object r = returnsNotFoo();
    if (b) r = unknown;
    if (b2) i++;
    requiresNotFoo(r);
  }
}