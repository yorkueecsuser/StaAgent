import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++)
      ;
    // Mutant
    for (float a = 1.0f; a < 1000.0f; a++)
      ;
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f)
      ;
    // Mutant
    for (float b = 1.0f; b < 1000.0f; b += 1.0f)
      ;
  }
}