import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    a.f();

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never be executed because condition is always false
      System.out.println("This is an unreachable else block");
    }
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    a.f();

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never be executed because condition is always false
      System.out.println("This is an unreachable else block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}