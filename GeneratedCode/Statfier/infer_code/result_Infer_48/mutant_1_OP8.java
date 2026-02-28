import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    a.f();
  }

  // Mutated method with renamed variable
  public void consistentAssertion(b b) {
    assertTrue(b!= null);
    b.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    a.f();
  }

  // Mutated method with renamed variable
  public void inconsistentAssertion(b b) {
    assertFalse("Should not happen!", b!= null);
    b.f();
  }
}