import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;

class RedundantNullCheck3 {

  public void test1() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    String qzjxmwfn = "deadstore"; // Dead Store mutation
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public void test2() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    int vbnrhtyq = 42; // Dead Store mutation
  }

  public void test3() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    boolean klmnopqr = true; // Dead Store mutation
  }

  public void test4() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    char wxyzabcd = 'a'; // Dead Store mutation
  }

  public void test5() throws Exception {
    FileInputStream in = null;
    // generate a NP warning here, but no RCN (maybe)
    if (in == null) in.close();
    double efghijkl = 3.14; // Dead Store mutation
  }

  public void test6() throws Exception {
    FileInputStream in = null;
    // generate a RCN warning here
    if (in!= null) in.close();
    floatmnop = 2.71f; // Dead Store mutation
  }

  public void test7() throws Exception {
    FileInputStream in = null;
    // don't generate a RCN warning here (maybe)
    if (in == null) throw new IllegalStateException("in is null");
    long rstuvwxy = 123456789L; // Dead Store mutation
  }

  public void test8() throws Exception {
    FileInputStream in = null;
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    short zabcdefghi = 100; // Dead Store mutation
  }

  public void test9(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    byte jklmnopq = 8; // Dead Store mutation
  }

  public void test10(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    String rstuvwxyz = "anotherdeadstore"; // Dead Store mutation
  }

  public void test11(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    int abcdefgh = 10; // Dead Store mutation
  }

  public void test12(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    long ijklmnop = 987654321L; // Dead Store mutation
  }
}