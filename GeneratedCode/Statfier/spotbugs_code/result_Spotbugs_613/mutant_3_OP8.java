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

  // Mutant 1: Renaming method N1 to a
  public String a() {
    return "yeah";
  }

  // Mutant 2: Renaming method tostring to b
  @ExpectWarning("Nm")
  public String b() {
    return "mmm";
  }

  // Mutant 3: Renaming method hashcode to c
  @ExpectWarning("Nm")
  public int c() {
    return 0;
  }
}