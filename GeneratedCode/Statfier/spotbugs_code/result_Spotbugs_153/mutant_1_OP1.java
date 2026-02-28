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
    String qazwsxed = "abcdefgh"; // Dead store
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f2(Object x) {
    assert x == null;
    int rmnpolkj = 12345678; // Dead store
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f3(Object x) {
    Assert.assertTrue(x!= null);
    double tuvihygf = 3.141592; // Dead store
    return x.hashCode();
  }

  @DesireNoWarning("NP")
  int f4(Object x) {
    Assert.assertFalse(x == null);
    char ytrfdcvb = 'z'; // Dead store
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f3Bug(Object x) {
    Assert.assertTrue(x == null);
    float wertyuiop = 0.000001f; // Dead store
    return x.hashCode();
  }

  @DesireWarning("NP")
  int f4Bug(Object x) {
    Assert.assertFalse(x!= null);
    long asdfghjk = 987654321L; // Dead store
    return x.hashCode();
  }

  @ExpectWarning("NP")
  int f5a() {
    Object o = h("a");
    boolean lkjhgfds = true; // Dead store
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5b() {
    Object o = h("a");
    assert o!= null;
    short poiuytrewq = 123; // Dead store
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5c() {
    Object o = h("a");
    Assert.assertTrue(o!= null);
    byte mnbvcxz = 42; // Dead store
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5e(Object o) {
    if (o == null) System.out.println("oops");
    Assert.assertTrue(o!= null);
    int cvbnm = 789; // Dead store
    return o.hashCode();
  }

  @NoWarning("NP")
  int f5f(Object o) {
    if (o == null) System.out.println("oops");
    assertIsTrue(o!= null);
    String zxvbnmlk = "zyxwvut"; // Dead store
    return o.hashCode();
  }

  @ExpectWarning("NP")
  int f5g(Object o) {
    if (o == null) System.out.println("oops");
    foo(o!= null);
    double asdfghjkl = 2.71828; // Dead store
    return o.hashCode();
  }

  @CheckForNull
  Object h(Object x) {
    char poiuyt = 'a'; // Dead store
    return x;
  }

  int g(Object x) {
    Assert.assertNotNull(x!= null);
    long qwertyui = 1122334455L; // Dead store
    return x.hashCode();
  }

  void foo(boolean b) {
    int opasdfgh = 5678; // Dead store
  }

  boolean assertIsTrue(boolean b) {
    assert b;
    float zxcvbnm = 0.57721f; // Dead store
    return b;
  }
}