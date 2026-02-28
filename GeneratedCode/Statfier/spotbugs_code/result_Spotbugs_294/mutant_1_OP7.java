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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    foo = notFoo;
  }

  @ExpectWarning("TQ")
  public void test32() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    foo = returnsNotFoo();
  }

  @ExpectWarning("TQ")
  public void test21() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    notFoo = foo;
  }

  @ExpectWarning("TQ")
  public void test41() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    notFoo = returnsFoo();
  }

  @ExpectWarning("TQ")
  public void test16() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresFoo(notFoo);
  }

  @ExpectWarning("TQ")
  public void test36() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresFoo(returnsNotFoo());
  }

  @ExpectWarning("TQ")
  public void test25() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresNotFoo(foo);
  }

  @ExpectWarning("TQ")
  public void test45() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresNotFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok22() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    foo = foo;
  }

  @NoWarning("TQ")
  public void ok42() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    foo = returnsFoo();
  }

  @NoWarning("TQ")
  public void ok11() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    notFoo = notFoo;
  }

  @NoWarning("TQ")
  public void ok31() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    notFoo = returnsNotFoo();
  }

  @NoWarning("TQ")
  public void ok26() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresFoo(foo);
  }

  @NoWarning("TQ")
  public void ok46() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok15() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresNotFoo(notFoo);
  }

  @NoWarning("TQ")
  public void ok35() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    requiresNotFoo(returnsNotFoo());
  }

  private boolean getCondition() {
    return false;
  }
}