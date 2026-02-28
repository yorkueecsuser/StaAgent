import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    float x = 1.0f;
    do {
      ;
    } while (x++ < 1000.0f);
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    float x = 1.0f;
    do {
      ;
    } while ((x += 1.0f) < 1000.0f);
  }
}