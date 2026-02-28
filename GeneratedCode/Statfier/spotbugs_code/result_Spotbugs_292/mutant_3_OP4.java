import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestFooGuaranteedControlFlow {

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
    foo = notFoo2;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test12");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test12");
    }
  }

  @ExpectWarning("TQ")
  public void test32() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    foo = returnsNotFoo;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test32");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test32");
    }
  }

  @ExpectWarning("TQ")
  public void test21() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    notFoo = foo2;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test21");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test21");
    }
  }

  @ExpectWarning("TQ")
  public void test41() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    notFoo = returnsFoo;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test41");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test41");
    }
  }

  @ExpectWarning("TQ")
  public void test16() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    requiresFoo(notFoo2);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test16");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test16");
    }
  }

  @ExpectWarning("TQ")
  public void test36() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    requiresFoo(returnsNotFoo);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test36");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test36");
    }
  }

  @ExpectWarning("TQ")
  public void test25() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    requiresNotFoo(foo2);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test25");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test25");
    }
  }

  @ExpectWarning("TQ")
  public void test45() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    requiresNotFoo(returnsFoo);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in test45");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in test45");
    }
  }

  @NoWarning("TQ")
  public void ok22() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    foo = foo2;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok22");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok22");
    }
  }

  @NoWarning("TQ")
  public void ok42() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    foo = returnsFoo;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok42");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok42");
    }
  }

  @NoWarning("TQ")
  public void ok11() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    notFoo = notFoo2;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok11");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok11");
    }
  }

  @NoWarning("TQ")
  public void ok31() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    notFoo = returnsNotFoo;

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok31");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok31");
    }
  }

  @NoWarning("TQ")
  public void ok26() {
    Object foo2 = foo;
    if (b) foo2 = unknown;
    if (b2) i++;
    requiresFoo(foo2);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok26");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok26");
    }
  }

  @NoWarning("TQ")
  public void ok46() {
    Object returnsFoo = returnsFoo();
    if (b) returnsFoo = unknown;
    if (b2) i++;
    requiresFoo(returnsFoo);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok46");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok46");
    }
  }

  @NoWarning("TQ")
  public void ok15() {
    Object notFoo2 = notFoo;
    if (b) notFoo2 = unknown;
    if (b2) i++;
    requiresNotFoo(notFoo2);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok15");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok15");
    }
  }

  @NoWarning("TQ")
  public void ok35() {
    Object returnsNotFoo = returnsNotFoo();
    if (b) returnsNotFoo = unknown;
    if (b2) i++;
    requiresNotFoo(returnsNotFoo);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block in ok35");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block in ok35");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}