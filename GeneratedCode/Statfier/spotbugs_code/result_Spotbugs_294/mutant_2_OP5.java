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
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 10;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 20;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 30;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 40;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 50;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 60;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 70;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 80;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 90;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 100;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 110;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 120;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 130;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 140;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 150;
        break;
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        int unreachableVar = 160;
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}