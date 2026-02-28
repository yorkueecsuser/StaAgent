import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.FileInputStream;

class RedundantNullCheck3 {

  public void test1() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    // Mutant
    FileInputStream in1 = new FileInputStream("/dev/null");
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public void test2() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    // Mutant
    FileInputStream in2 = new FileInputStream("/dev/null");
  }

  public void test3() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in3 = new FileInputStream("/dev/null");
  }

  public void test4() throws Exception {
    FileInputStream in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in4 = new FileInputStream("/dev/null");
  }

  public void test5() throws Exception {
    FileInputStream in = null;
    // generate a NP warning here, but no RCN (maybe)
    if (in == null) in.close();
    // Mutant
    FileInputStream in5 = null;
  }

  public void test6() throws Exception {
    FileInputStream in = null;
    // generate a RCN warning here
    if (in!= null) in.close();
    // Mutant
    FileInputStream in6 = null;
  }

  public void test7() throws Exception {
    FileInputStream in = null;
    // don't generate a RCN warning here (maybe)
    if (in == null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in7 = null;
  }

  public void test8() throws Exception {
    FileInputStream in = null;
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in8 = null;
  }

  public void test9(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in == null) in.close();
    // Mutant
    FileInputStream in9 = null;
    if (b) in9 = new FileInputStream("/dev/null");
  }

  public void test10(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in!= null) in.close();
    // Mutant
    FileInputStream in10 = null;
    if (b) in10 = new FileInputStream("/dev/null");
  }

  public void test11(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // don't generate a warning here
    if (in == null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in11 = null;
    if (b) in11 = new FileInputStream("/dev/null");
  }

  public void test12(boolean b) throws Exception {
    FileInputStream in = null;
    if (b) in = new FileInputStream("/dev/null");
    // generate a warning here
    if (in!= null) throw new IllegalStateException("in is null");
    // Mutant
    FileInputStream in12 = null;
    if (b) in12 = new FileInputStream("/dev/null");
  }
}