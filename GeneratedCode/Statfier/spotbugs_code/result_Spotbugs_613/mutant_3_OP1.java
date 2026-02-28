import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    // Dead store mutation
    String qzjxvbmn = "unused";
  }

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    // Dead store mutation
    int kphftrvw = 42;
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    // Dead store mutation
    boolean lmnoqrst = true;
    return 0;
  }
}