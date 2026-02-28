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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      notFoo2 = new Object();
    } else {
      notFoo2 = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    foo = returnsNotFoo;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNotFoo = new Object();
    } else {
      returnsNotFoo = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    notFoo = foo2;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      foo2 = new Object();
    } else {
      foo2 = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    notFoo = returnsFoo;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsFoo = new Object();
    } else {
      returnsFoo = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresFoo(notFoo2);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      notFoo2 = new Object();
    } else {
      notFoo2 = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresFoo(returnsNotFoo);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNotFoo = new Object();
    } else {
      returnsNotFoo = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresNotFoo(foo2);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      foo2 = new Object();
    } else {
      foo2 = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresNotFoo(returnsFoo);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsFoo = new Object();
    } else {
      returnsFoo = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    foo = foo2;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      foo2 = new Object();
    } else {
      foo2 = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    foo = returnsFoo;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsFoo = new Object();
    } else {
      returnsFoo = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    notFoo = notFoo2;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      notFoo2 = new Object();
    } else {
      notFoo2 = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    notFoo = returnsNotFoo;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNotFoo = new Object();
    } else {
      returnsNotFoo = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    requiresFoo(foo2);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      foo2 = new Object();
    } else {
      foo2 = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    requiresFoo(returnsFoo);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsFoo = new Object();
    } else {
      returnsFoo = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    requiresNotFoo(notFoo2);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      notFoo2 = new Object();
    } else {
      notFoo2 = new Object();
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    requiresNotFoo(returnsNotFoo);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNotFoo = new Object();
    } else {
      returnsNotFoo = new Object();
    }
  }
}