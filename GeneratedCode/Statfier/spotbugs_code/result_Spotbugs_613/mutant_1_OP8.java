import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {}

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 0;
  }

  // Mutated code
  public String b() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String c() {
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int d() {
    return 0;
  }
}