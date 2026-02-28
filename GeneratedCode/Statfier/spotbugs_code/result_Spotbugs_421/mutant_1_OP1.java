import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;

class RedundantNullCheck3 {

  public void test1() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    String yxqjvbnr = "deadstore"; // Dead Store Mutation
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public void test2() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    int wertghjk = 42; // Dead Store Mutation
  }

  public void test3() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    boolean fghjklmn = true; // Dead Store Mutation
  }

  public void test4() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    double zxcvbnml = 3.14; // Dead Store Mutation
  }

  public void test5() throws Exception {
    FileInputStream in = null;
    // generate a NP warning here, but no RCN (maybe)
    if (in == null) in.close();
    char asdfghjk = 'a'; // Dead Store Mutation
  }

  public void test6() throws Exception {
    FileInputStream in = null;
    // generate a RCN warning here
    if (in!= null) in.close();
    long poiuytrew = 123456789L; // Dead Store Mutation
  }

  public void test7() throws Exception {
    FileInputStream in = null;
    // don't generate a RCN warning here (maybe)
    if (in == null) throw new IllegalStateException("in is null");
    float lkjhgfds = 2.718f; // Dead Store Mutation
  }

  public void test8() throws Exception {
    FileInputStream in = null;
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    byte qwertyui = 10; // Dead Store Mutation
  }

  public void test9(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    short azertyui = 20; // Dead Store Mutation
  }

  public void test10(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    String tyuiopas = "anotherdeadstore"; // Dead Store Mutation
  }

  public void test11(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    int poiuytrt = 55; // Dead Store Mutation
  }

  public void test12(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    double mnbvcxz = 1.618; // Dead Store Mutation
  }
}