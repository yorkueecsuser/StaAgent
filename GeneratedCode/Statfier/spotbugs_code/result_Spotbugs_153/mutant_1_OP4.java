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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f2(Object x) {
    assert x == null;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object x) {
    Assert.assertTrue(x!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object x) {
    Assert.assertFalse(x == null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object x) {
    Assert.assertTrue(x == null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object x) {
    Assert.assertFalse(x!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object o = h("a");
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object o = h("a");
    assert o!= null;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return o.hashCode();
  }

  @CheckForNull
  Object h(Object x) {
    return x;
  }

  int g(Object x) {
    Assert.assertNotNull(x!= null);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
    }
    return x.hashCode();
  }

  void foo(boolean b) {}

  boolean assertIsTrue(boolean b) {
    assert b;
    return b;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}