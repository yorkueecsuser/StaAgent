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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    foo = returnsNotFoo;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    notFoo = foo2;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    notFoo = returnsFoo;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(notFoo2);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(returnsNotFoo);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(foo2);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(returnsFoo);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    foo = foo2;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    foo = returnsFoo;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    notFoo = notFoo2;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    notFoo = returnsNotFoo;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(foo2);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    else i--;
    requiresFoo(returnsFoo);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(notFoo2);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    else i--;
    requiresNotFoo(returnsNotFoo);

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
    } else {
      // This block will also never execute because condition is always false
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}