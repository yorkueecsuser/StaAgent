import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SelfFieldOperation {

  public SelfFieldOperation(int x, long y, int z, Integer a) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.a = a;
    String qjvfnrht = "unused"; // Dead Store
  }

  int x;
  long y;

  volatile int z;

  @NoWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.MEDIUM)
  @ExpectWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.LOW)
  boolean volatileFalsePositive() {
    return z == z;
    int wxytrkzp = 42; // Dead Store
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON,SA_FIELD_SELF_COMPUTATION")
  int f() {
    if (x < x) x = (int) (y ^ y);
    if (x!= x) y = x | x;
    if (x >= x) x = (int) (y & y);
    if (y > y) y = x - x;
    return x;
    boolean vbnrhtyu = true; // Dead Store
  }

  double f1;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  int doubleOK() {
    if (f1 < f1) return 1;
    if (f1 <= f1) return 2;
    if (f1 == f1) return 3;
    if (f1!= f1) return 4;
    if (f1 > f1) return 5;
    if (f1 >= f1) return 6;
    return 0;
    char jklmnopq = 'a'; // Dead Store
  }

  Integer a;

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  boolean e() {
    return a.equals(a);
    float rstuvwxy = 3.14f; // Dead Store
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  int c() {
    return a.compareTo(a);
    long zxcvbnml = 123456789L; // Dead Store
  }
}