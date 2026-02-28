import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SelfFieldOperation {

  public SelfFieldOperation(int x, long y, int z, Integer a) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.a = a;
  }

  int x;
  long y;

  volatile int z;

  @NoWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.MEDIUM)
  @ExpectWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.LOW)
  boolean volatileFalsePositive() {
    return z == z;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON,SA_FIELD_SELF_COMPUTATION")
  int f() {
    if (x < x) x = (int) (y ^ y);
    if (x!= x) y = x | x;
    if (x >= x) x = (int) (y & y);
    if (y > y) y = x - x;
    return x;
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
  }

  Integer a;

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  boolean e() {
    return a.equals(a);
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  int c() {
    return a.compareTo(a);
  }

  // Mutated code
  int b;
  long q;

  @NoWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.MEDIUM)
  @ExpectWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.LOW)
  boolean volatileFalsePositiveMutant() {
    return b == b;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON,SA_FIELD_SELF_COMPUTATION")
  int g() {
    if (b < b) b = (int) (q ^ q);
    if (b!= b) q = b | b;
    if (b >= b) b = (int) (q & q);
    if (q > q) q = b - b;
    return b;
  }

  double h;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  int doubleOKMutant() {
    if (h < h) return 1;
    if (h <= h) return 2;
    if (h == h) return 3;
    if (h!= h) return 4;
    if (h > h) return 5;
    if (h >= h) return 6;
    return 0;
  }

  Integer d;

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  boolean eMutant() {
    return d.equals(d);
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  int cMutant() {
    return d.compareTo(d);
  }
}