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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    foo = returnsNotFoo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    notFoo = foo;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    notFoo = returnsFoo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    requiresFoo(notFoo);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    requiresFoo(returnsNotFoo());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    requiresNotFoo(foo);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    requiresNotFoo(returnsFoo());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    foo = foo;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    foo = returnsFoo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    notFoo = notFoo;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    notFoo = returnsNotFoo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    requiresFoo(foo);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    requiresFoo(returnsFoo());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    requiresNotFoo(notFoo);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    requiresNotFoo(returnsNotFoo());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}