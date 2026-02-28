import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import junit.framework.Assert;

class Ideas_2011_12_19 {

  static final Logger LOG = Logger.getLogger(Ideas_2011_12_19.class.getName());

  @NoWarning("NP")
  int f(Object x) {
    assert x!= null;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f2(Object x) {
    assert x == null;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object x) {
    Assert.assertTrue(x!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object x) {
    Assert.assertFalse(x == null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object x) {
    Assert.assertTrue(x == null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object x) {
    Assert.assertFalse(x!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object o = h("a");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object o = h("a");
    assert o!= null;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o.hashCode();
  }

  @CheckForNull
  Object h(Object x) {
    return x;
  }

  int g(Object x) {
    Assert.assertNotNull(x!= null);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x.hashCode();
  }

  void foo(boolean b) {}

  boolean assertIsTrue(boolean b) {
    assert b;
    return b;
  }

  private boolean getCondition() {
    return false;
  }
}