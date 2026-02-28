import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    // Dead store mutation
    String jxvqznhp = "unusedVariable";
  }

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    // Dead store mutation
    int qkfnrhty = 42;
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    // Dead store mutation
    boolean wjgkxvbn = true;
    return 0;
  }
}