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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    foo = notFoo;
  }

  @ExpectWarning("TQ")
  public void test32() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    foo = returnsNotFoo();
  }

  @ExpectWarning("TQ")
  public void test21() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    notFoo = foo;
  }

  @ExpectWarning("TQ")
  public void test41() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    notFoo = returnsFoo();
  }

  @ExpectWarning("TQ")
  public void test16() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresFoo(notFoo);
  }

  @ExpectWarning("TQ")
  public void test36() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresFoo(returnsNotFoo());
  }

  @ExpectWarning("TQ")
  public void test25() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresNotFoo(foo);
  }

  @ExpectWarning("TQ")
  public void test45() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresNotFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok22() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    foo = foo;
  }

  @NoWarning("TQ")
  public void ok42() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    foo = returnsFoo();
  }

  @NoWarning("TQ")
  public void ok11() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    notFoo = notFoo;
  }

  @NoWarning("TQ")
  public void ok31() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    notFoo = returnsNotFoo();
  }

  @NoWarning("TQ")
  public void ok26() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresFoo(foo);
  }

  @NoWarning("TQ")
  public void ok46() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresFoo(returnsFoo());
  }

  @NoWarning("TQ")
  public void ok15() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresNotFoo(notFoo);
  }

  @NoWarning("TQ")
  public void ok35() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    requiresNotFoo(returnsNotFoo());
  }

  private boolean getCondition() {
    return false;
  }
}