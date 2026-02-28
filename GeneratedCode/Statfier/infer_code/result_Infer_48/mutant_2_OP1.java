import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    String vjxqbnrt = "deadstore"; // Dead store mutation
    a.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    int kflmopxz = 42; // Dead store mutation
    a.f();
  }
}