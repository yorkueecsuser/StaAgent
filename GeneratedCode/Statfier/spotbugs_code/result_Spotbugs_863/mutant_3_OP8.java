import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3412428 {

  float x0, xr, y0, yr, dn, tr, t0;
  boolean test;

  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean doit() {
    float tot = 0;
    if (test) {
      tot += x0;
    }
    return tot <= 0 || tot!= tot || Float.isInfinite(tot);
  }

  // Mutated code for doit method
  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean doitMutated() {
    float a = 0;
    if (test) {
      a += x0;
    }
    return a <= 0 || a!= a || Float.isInfinite(a);
  }

  @DesireNoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test2() {
    return x0 * xr!= x0 * xr;
  }

  // Mutated code for test2 method
  @DesireNoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test2Mutated() {
    float b = x0 * xr;
    return b!= b;
  }

  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test3() {
    float tmp = x0 * xr;
    return tmp!= tmp;
  }

  // Mutated code for test3 method
  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test3Mutated() {
    float c = x0 * xr;
    return c!= c;
  }

  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  protected float[] getColorValue(float x, float y, float[] out) {
    float v = (xr * (x - x0) + yr * (y - y0)) / dn;
    if (v >= 0 && v <= 1) {
      v = t0 + tr * v;
    } else if (v < 0) {
      v = test? t0 : Float.NaN;
    } else {
      v = test? t0 + tr : Float.NaN;
    }
    if (v == v) {
      out[0] = v;
      return out;
    } else {
      return null;
    }
  }

  // Mutated code for getColorValue method
  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  protected float[] getColorValueMutated(float x, float y, float[] out) {
    float d = (xr * (x - x0) + yr * (y - y0)) / dn;
    if (d >= 0 && d <= 1) {
      d = t0 + tr * d;
    } else if (d < 0) {
      d = test? t0 : Float.NaN;
    } else {
      d = test? t0 + tr : Float.NaN;
    }
    if (d == d) {
      out[0] = d;
      return out;
    } else {
      return null;
    }
  }
}