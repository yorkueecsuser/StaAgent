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

  // Mutant 1: Renaming variable 'a' to 'b' in consistentAssertion method
  public void consistentAssertion(A b) {
    assertTrue(b!= null);
    b.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    a.f();
  }

  // Mutant 2: Renaming variable 'a' to 'c' in inconsistentAssertion method
  public void inconsistentAssertion(A c) {
    assertFalse("Should not happen!", c!= null);
    c.f();
  }
}