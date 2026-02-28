import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    a.f();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    a.f();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}