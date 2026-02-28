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
    String qvbnrhty = "deadstore"; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    foo = returnsNotFoo;
    int kjfghvbn = 42; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    notFoo = foo2;
    boolean zxcvbnml = true; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    notFoo = returnsFoo;
    double asdfghjk = 3.14; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    requiresFoo(notFoo2);
    char qwertyui = 'a'; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    requiresFoo(returnsNotFoo);
    long poiuytrew = 123456789L; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    requiresNotFoo(foo2);
    float lkjhgfdsa = 2.718f; // Dead Store
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    requiresNotFoo(returnsFoo);
    short mnbvcxza = 100; // Dead Store
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok22() {
    Object foo2 = foo;
    foo = foo2;
    byte cvbnmkji = 8; // Dead Store
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    foo = returnsFoo;
    String hjklpoiuyt = "anotherdeadstore"; // Dead Store
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok11() {
    Object notFoo2 = notFoo;
    notFoo = notFoo2;
    int yuioplkjhg = 2468; // Dead Store
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    notFoo = returnsNotFoo;
    boolean tfghvbnm = false; // Dead Store
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    requiresFoo(foo2);
    double wertyuiop = 1.618; // Dead Store
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    requiresFoo(returnsFoo);
    char asdfghjkl = 'b'; // Dead Store
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    requiresNotFoo(notFoo2);
    long poiuytrewq = 987654321L; // Dead Store
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    requiresNotFoo(returnsNotFoo);
    float lkjhgfdsap = 0.577f; // Dead Store
  }
}