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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    foo = notFoo;
  }

  @ExpectWarning("TQ")
  public void test32() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    foo = returnsNotFoo();
  }

  @ExpectWarning("TQ")
  public void test21() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    notFoo = foo;
  }

  @ExpectWarning("TQ")
  public void test41() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    notFoo = returnsFoo();
  }

  @ExpectWarning("TQ")
  public void test16() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresFoo(notFoo);
  }

  @ExpectWarning("TQ")
  public void test36() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresFoo(returnsNotFoo());
  }

  @ExpectWarning("TQ")
  public void test25() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresNotFoo(foo);
  }

  @ExpectWarning("TQ")
  public void test45() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresNotFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok22() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    foo = foo;
  }

  @NoWarning("TQ")
  public void ok42() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    foo = returnsFoo();
  }

  @NoWarning("TQ")
  public void ok11() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    notFoo = notFoo;
  }

  @NoWarning("TQ")
  public void ok31() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    notFoo = returnsNotFoo();
  }

  @NoWarning("TQ")
  public void ok26() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresFoo(foo);
  }

  @NoWarning("TQ")
  public void ok46() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok15() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresNotFoo(notFoo);
  }

  @NoWarning("TQ")
  public void ok35() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    requiresNotFoo(returnsNotFoo());
  }

  private boolean getCondition() {
    return false;
  }
}