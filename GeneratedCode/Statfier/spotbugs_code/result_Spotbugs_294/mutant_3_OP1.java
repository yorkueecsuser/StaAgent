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
    String abcd1234 = "unusedVariable";
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
    int efgh5678 = 42;
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
    boolean ijkl9012 = true;
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
    double mnop3456 = 3.14;
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
    char qrst7890 = 'x';
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
    long uvwx1234 = 100L;
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
    float yzab5678 = 2.71f;
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
    byte cdef9012 = 10;
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
    short ghij3456 = 20;
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
    String klmn7890 = "anotherUnused";
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
    int opqr1234 = 30;
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
    boolean stuv5678 = false;
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
    double wxyz9012 = 1.618;
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
    char abcd3456 = 'y';
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
    long efgh7890 = 200L;
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
    float ijkl1234 = 3.1415f;
  }
}