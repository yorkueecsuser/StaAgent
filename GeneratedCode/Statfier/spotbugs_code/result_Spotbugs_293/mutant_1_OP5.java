import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooGuaranteedControlFlow2 {

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

  boolean b, b2;

  int i;

  public Object unknown;

  @ExpectWarning("TQ")
  public void test12() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    foo = notFoo2;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 1:
        i += 10; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    foo = returnsNotFoo;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 2:
        i += 20; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    notFoo = foo2;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 3:
        i += 30; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    notFoo = returnsFoo;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 4:
        i += 40; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(notFoo2);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 5:
        i += 50; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(returnsNotFoo);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 6:
        i += 60; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(foo2);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 7:
        i += 70; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(returnsFoo);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 8:
        i += 80; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    foo = foo2;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 9:
        i += 90; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    foo = returnsFoo;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 10:
        i += 100; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    notFoo = notFoo2;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 11:
        i += 110; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    notFoo = returnsNotFoo;

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 12:
        i += 120; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(foo2);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 13:
        i += 130; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(returnsFoo);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 14:
        i += 140; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(notFoo2);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 15:
        i += 150; // This case is unreachable
        break;
      default:
        break;
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(returnsNotFoo);

    // Unreachable switch statement
    boolean condition = false;
    switch(getValue()) {
      case 16:
        i += 160; // This case is unreachable
        break;
      default:
        break;
    }
  }

  private int getValue() {
    return 0; // Always returns 0, making the switch cases unreachable
  }
}