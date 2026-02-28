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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      x = x + 1; // Some operation to make the loop body non-empty
    }
    if (x < x) x = (int) (y ^ y);
    if (x!= x) y = x | x;
    if (x >= x) x = (int) (y & y);
    if (y > y) y = x - x;
    return x;
  }

  double f1;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  int doubleOK() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      f1 = f1 + 1.0; // Some operation to make the loop body non-empty
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      a = a + 1; // Some operation to make the loop body non-empty
    }
    return a.equals(a);
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  int c() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      a = a + 1; // Some operation to make the loop body non-empty
    }
    return a.compareTo(a);
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loops unreachable
  }
}