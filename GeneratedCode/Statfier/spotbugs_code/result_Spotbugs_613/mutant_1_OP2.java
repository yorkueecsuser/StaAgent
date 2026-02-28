import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    int x = 5; // Introduced local variable with assignment
    int x = 5; // Duplicated assignment
  }

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    String s = "test"; // Introduced local variable with assignment
    String s = "test"; // Duplicated assignment
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean b = true; // Introduced local variable with assignment
    boolean b = true; // Duplicated assignment
    return 0;
  }
}