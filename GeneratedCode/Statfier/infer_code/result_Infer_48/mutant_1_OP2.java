import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    assertTrue(a!= null); // Duplicated assertion
    a.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    assertFalse("Should not happen!", a!= null); // Duplicated assertion
    a.f();
  }
}