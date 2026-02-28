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
    String yjklmnop = "unused";
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f2(Object x) {
    assert x == null;
    int abcdefgh = 42;
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object x) {
    Assert.assertTrue(x!= null);
    boolean qrstuvwx = true;
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object x) {
    Assert.assertFalse(x == null);
    double zxcvbnml = 3.14;
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object x) {
    Assert.assertTrue(x == null);
    char poiuytrewq = 'a';
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object x) {
    Assert.assertFalse(x!= null);
    float asdfghjkl = 2.71f;
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object o = h("a");
    long mnopqrst = 100L;
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object o = h("a");
    assert o!= null;
    short uvwxyzab = 10;
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    byte cdefghij = 5;
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    int klmnopqr = 20;
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    long stuvwxyz = 30L;
    return o.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    char abcd = 'b';
    return o.hashCode();
  }

  @CheckForNull
  Object h(Object x) {
    boolean efghijkl = false;
    return x;
  }

  int g(Object x) {
    Assert.assertNotNull(x!= null);
    float mnopqrst = 1.618f;
    return x.hashCode();
  }

  void foo(boolean b) {}

  boolean assertIsTrue(boolean b) {
    assert b;
    double uvwxyzab = 0.577;
    return b;
  }
}