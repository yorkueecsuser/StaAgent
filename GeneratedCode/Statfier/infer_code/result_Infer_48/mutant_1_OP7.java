import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    assertTrue(a!= null);
    a.f();
  }

  public void inconsistentAssertion(A a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    assertFalse("Should not happen!", a!= null);
    a.f();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}