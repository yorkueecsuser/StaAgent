import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {}

  public String N1() {
    return "yeah";
    // Duplicate of the return statement
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "mmm";
    // Duplicate of the return statement
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 0;
    // Duplicate of the return statement
    return 0;
  }
}