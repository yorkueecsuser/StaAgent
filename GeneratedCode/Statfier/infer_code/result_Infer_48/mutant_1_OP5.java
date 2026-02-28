import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    a.f();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    a.f();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}