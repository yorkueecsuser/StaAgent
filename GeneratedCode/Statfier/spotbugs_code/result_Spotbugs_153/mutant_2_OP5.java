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
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f2(Object x) {
    assert x == null;
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object x) {
    Assert.assertTrue(x!= null);
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object x) {
    Assert.assertFalse(x == null);
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object x) {
    Assert.assertTrue(x == null);
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object x) {
    Assert.assertFalse(x!= null);
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object o = h("a");
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object o = h("a");
    assert o!= null;
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    return o.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    return o.hashCode();
  }

  @CheckForNull
  Object h(Object x) {
    return x;
  }

  int g(Object x) {
    Assert.assertNotNull(x!= null);
    return x.hashCode();
  }

  void foo(boolean b) {}

  boolean assertIsTrue(boolean b) {
    assert b;
    return b;
  }

  // Mutant code added here
  boolean getUnreachableCondition() {
    return false;
  }

  int fWithUnreachableSwitch(Object x) {
    assert x!= null;
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f2WithUnreachableSwitch(Object x) {
    assert x == null;
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f3WithUnreachableSwitch(Object x) {
    Assert.assertTrue(x!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f4WithUnreachableSwitch(Object x) {
    Assert.assertFalse(x == null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f3BugWithUnreachableSwitch(Object x) {
    Assert.assertTrue(x == null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f4BugWithUnreachableSwitch(Object x) {
    Assert.assertFalse(x!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }

  int f5aWithUnreachableSwitch() {
    Object o = h("a");
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int f5bWithUnreachableSwitch() {
    Object o = h("a");
    assert o!= null;
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int f5cWithUnreachableSwitch() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int f5eWithUnreachableSwitch(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int f5fWithUnreachableSwitch(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int f5gWithUnreachableSwitch(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return o.hashCode();
  }

  int gWithUnreachableSwitch(Object x) {
    Assert.assertNotNull(x!= null);
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return x.hashCode();
  }
}