import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;

class RedundantNullCheck3 {

  public void test1() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();

    // Mutated code
    FileInputStream x = new FileInputStream("/dev/null");
    if (x == null) x.close();
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public void test2() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();

    // Mutated code
    FileInputStream y = new FileInputStream("/dev/null");
    if (y!= null) y.close();
  }

  public void test3() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream z = new FileInputStream("/dev/null");
    if (z == null) throw new IllegalStateException("z is null");
  }

  public void test4() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream w = new FileInputStream("/dev/null");
    if (w!= null) throw new IllegalStateException("w is null");
  }

  public void test5() throws Exception {
    FileInputStream in = null;
    // generate a NP warning here, but no RCN (maybe)
    if (in == null) in.close();

    // Mutated code
    FileInputStream v = null;
    if (v == null) v.close();
  }

  public void test6() throws Exception {
    FileInputStream in = null;
    // generate a RCN warning here
    if (in!= null) in.close();

    // Mutated code
    FileInputStream u = null;
    if (u!= null) u.close();
  }

  public void test7() throws Exception {
    FileInputStream in = null;
    // don't generate a RCN warning here (maybe)
    if (in == null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream t = null;
    if (t == null) throw new IllegalStateException("t is null");
  }

  public void test8() throws Exception {
    FileInputStream in = null;
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream s = null;
    if (s!= null) throw new IllegalStateException("s is null");
  }

  public void test9(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();

    // Mutated code
    FileInputStream r = null;
    if (b) r = new FileInputStream("/dev/null");
    if (r == null) r.close();
  }

  public void test10(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();

    // Mutated code
    FileInputStream q = null;
    if (b) q = new FileInputStream("/dev/null");
    if (q!= null) q.close();
  }

  public void test11(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream p = null;
    if (b) p = new FileInputStream("/dev/null");
    if (p == null) throw new IllegalStateException("p is null");
  }

  public void test12(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");

    // Mutated code
    FileInputStream o = null;
    if (b) o = new FileInputStream("/dev/null");
    if (o!= null) throw new IllegalStateException("o is null");
  }
}