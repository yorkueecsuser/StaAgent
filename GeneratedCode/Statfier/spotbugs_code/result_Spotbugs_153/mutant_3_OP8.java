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

  // Mutated code
  @NoWarning("NP")
  int fMutated(Object y) {
    assert y!= null;
    return y.hashCode();
  }

  @ExpectWarning("NP")
  int f2Mutated(Object y) {
    assert y == null;
    return y.hashCode();
  }

  @DesireNoWarning("NP")
  int f3Mutated(Object y) {
    Assert.assertTrue(y!= null);
    return y.hashCode();
  }

  @DesireNoWarning("NP")
  int f4Mutated(Object y) {
    Assert.assertFalse(y == null);
    return y.hashCode();
  }

  @DesireWarning("NP")
  int f3BugMutated(Object y) {
    Assert.assertTrue(y == null);
    return y.hashCode();
  }

  @DesireWarning("NP")
  int f4BugMutated(Object y) {
    Assert.assertFalse(y!= null);
    return y.hashCode();
  }

  @ExpectWarning("NP")
  int f5aMutated() {
    Object p = h("a");
    return p.hashCode();
  }

  @NoWarning("NP")
  int f5bMutated() {
    Object p = h("a");
    assert p!= null;
    return p.hashCode();
  }

  @NoWarning("NP")
  int f5cMutated() {
    Object p = h("a");
    Assert.assertTrue(p!= null);
    return p.hashCode();
  }

  @NoWarning("NP")
  int f5eMutated(Object p) {
    if (p == null) System.out.println("oops");
    Assert.assertTrue(p!= null);
    return p.hashCode();
  }

  @NoWarning("NP")
  int f5fMutated(Object p) {
    if (p == null) System.out.println("oops");
    assertIsTrue(p!= null);
    return p.hashCode();
  }

  @ExpectWarning("NP")
  int f5gMutated(Object p) {
    if (p == null) System.out.println("oops");
    foo(p!= null);
    return p.hashCode();
  }

  @CheckForNull
  Object hMutated(Object y) {
    return y;
  }

  int gMutated(Object y) {
    Assert.assertNotNull(y!= null);
    return y.hashCode();
  }

  void fooMutated(boolean c) {}

  boolean assertIsTrueMutated(boolean c) {
    assert c;
    return c;
  }
}