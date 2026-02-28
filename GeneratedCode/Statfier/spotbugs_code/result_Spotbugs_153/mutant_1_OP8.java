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
  int f2(Object y) {
    assert y == null;
    return y.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object z) {
    Assert.assertTrue(z!= null);
    return z.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object w) {
    Assert.assertFalse(w == null);
    return w.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object v) {
    Assert.assertTrue(v == null);
    return v.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object u) {
    Assert.assertFalse(u!= null);
    return u.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object p = h("a");
    return p.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object q = h("a");
    assert q!= null;
    return q.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object r = h("a");
    Assert.assertTrue(r!= null);
    return r.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object s) {
    if (s == null) System.out.println("oops");
    Assert.assertTrue(s!= null);
    return s.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object t) {
    if (t == null) System.out.println("oops");
    assertIsTrue(t!= null);
    return t.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object k) {
    if (k == null) System.out.println("oops");
    foo(k!= null);
    return k.hashCode();
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
}