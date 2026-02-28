import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    assertTrue(a!= null); // Duplicated condition
    a.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    assertFalse("Should not happen!", a!= null); // Duplicated condition
    a.f();
  }
}