import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooNoControlFlow2 {

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
    Object notFoo2 = notFoo;
    foo = notFoo2;
    String abcdefgh = "abcdefgh"; // Dead store
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    foo = returnsNotFoo;
    int ijklmnop = 12345678; // Dead store
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    notFoo = foo2;
    boolean opqrstuv = true; // Dead store
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    notFoo = returnsFoo;
    double vwxyzabc = 987654321.0; // Dead store
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    requiresFoo(notFoo2);
    char cdefghij = 'a'; // Dead store
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    requiresFoo(returnsNotFoo);
    float klmnopqr = 123.456f; // Dead store
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    requiresNotFoo(foo2);
    long stuvwxyz = 9876543210L; // Dead store
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    requiresNotFoo(returnsFoo);
    short zabcdefgh = 12345; // Dead store
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok22() {
    Object foo2 = foo;
    foo = foo2;
    byte abcdefgh = 10; // Dead store
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    foo = returnsFoo;
    short ijklmnop = 20; // Dead store
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok11() {
    Object notFoo2 = notFoo;
    notFoo = notFoo2;
    int opqrstuv = 30; // Dead store
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    notFoo = returnsNotFoo;
    long vwxyzabc = 40; // Dead store
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    requiresFoo(foo2);
    float cdefghij = 50.5f; // Dead store
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    requiresFoo(returnsFoo);
    double klmnopqr = 60.6; // Dead store
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    requiresNotFoo(notFoo2);
    boolean stuvwxyz = false; // Dead store
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    requiresNotFoo(returnsNotFoo);
    char zabcdefgh = 'b'; // Dead store
  }
}