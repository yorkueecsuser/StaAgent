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
  long v;

  @NoWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.MEDIUM)
  @ExpectWarning(value = "SA_FIELD_SELF_COMPARISON", confidence = Confidence.LOW)
  boolean volatileFalsePositiveMutant() {
    return b == b;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON,SA_FIELD_SELF_COMPUTATION")
  int g() {
    if (b < b) b = (int) (v ^ v);
    if (b!= b) v = b | b;
    if (b >= b) b = (int) (v & v);
    if (v > v) v = b - b;
    return b;
  }

  double d;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  int doubleOKMutant() {
    if (d < d) return 1;
    if (d <= d) return 2;
    if (d == d) return 3;
    if (d!= d) return 4;
    if (d > d) return 5;
    if (d >= d) return 6;
    return 0;
  }

  Integer q;

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  boolean eMutant() {
    return q.equals(q);
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  int cMutant() {
    return q.compareTo(q);
  }
}