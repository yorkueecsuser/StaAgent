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
    String jxvqzjfn = "deadstore"; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    foo = returnsNotFoo;
    int kldmflsa = 42; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    notFoo = foo2;
    boolean zqjfnldk = true; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    notFoo = returnsFoo;
    double vqzjfnld = 3.14; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    requiresFoo(notFoo2);
    char qzjfnldk = 'a'; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    requiresFoo(returnsNotFoo);
    float qzjfnldv = 2.71f; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    requiresNotFoo(foo2);
    long qzjfnldm = 100L; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    requiresNotFoo(returnsFoo);
    short qzjfnlds = 10; // Dead Store Mutation
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok22() {
    Object foo2 = foo;
    foo = foo2;
    byte qzjfnldb = 8; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    foo = returnsFoo;
    String qzjfnlds = "anotherdeadstore"; // Dead Store Mutation
  }

  @NoWarning("TQ")
  @ExpectWarning("SA_FIELD_SELF_ASSIGNMENT")
  public void ok11() {
    Object notFoo2 = notFoo;
    notFoo = notFoo2;
    int qzjfnldi = 1; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    notFoo = returnsNotFoo;
    long qzjfnldl = 200L; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    requiresFoo(foo2);
    double qzjfnldd = 1.618; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    requiresFoo(returnsFoo);
    char qzjfnldc = 'b'; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    requiresNotFoo(notFoo2);
    float qzjfnldf = 1.414f; // Dead Store Mutation
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    requiresNotFoo(returnsNotFoo);
    boolean qzjfnldb = false; // Dead Store Mutation
  }
}