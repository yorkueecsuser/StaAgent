import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {}

  public String N1() {
    int x = 5; // Hypothetical assignment statement
    int x = 5; // Duplicated assignment statement
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
}