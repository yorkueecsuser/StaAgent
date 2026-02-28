import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class JunitAssertion {
  class A {
    public void f() {}
  }

  public void consistentAssertion(A a) {
    assertTrue(a!= null);
    String qzjfnxrm = "unusedVariable"; // Dead Store
    a.f();
  }

  public void inconsistentAssertion(A a) {
    assertFalse("Should not happen!", a!= null);
    int vbnrhtyp = 42; // Dead Store
    a.f();
  }
}