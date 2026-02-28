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

  // Mutant: Renamed 'tot' to 'a'
  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean doitMutant() {
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

  // Mutant: Renamed 'tmp' to 'b'
  @DesireNoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test3() {
    float b = x0 * xr;
    return b!= b;
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

  // Mutant: Renamed 'v' to 'c'
  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  protected float[] getColorValueMutant(float x, float y, float[] out) {
    float c = (xr * (x - x0) + yr * (y - y0)) / dn;
    if (c >= 0 && c <= 1) {
      c = t0 + tr * c;
    } else if (c < 0) {
      c = test? t0 : Float.NaN;
    } else {
      c = test? t0 + tr : Float.NaN;
    }
    if (c == c) {
      out[0] = c;
      return out;
    } else {
      return null;
    }
  }
}