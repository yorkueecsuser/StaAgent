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
      tot += x0; // Mutation: duplicated assignment
    }
    return tot <= 0 || tot!= tot || Float.isInfinite(tot);
  }

  @DesireNoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test2() {
    return x0 * xr!= x0 * xr;
  }

  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  public boolean test3() {
    float tmp = x0 * xr;
    tmp = x0 * xr; // Mutation: duplicated assignment
    return tmp!= tmp;
  }

  @NoWarning("FE_FLOATING_POINT_EQUALITY")
  protected float[] getColorValue(float x, float y, float[] out) {
    float v = (xr * (x - x0) + yr * (y - y0)) / dn;
    v = (xr * (x - x0) + yr * (y - y0)) / dn; // Mutation: duplicated assignment
    if (v >= 0 && v <= 1) {
      v = t0 + tr * v;
      v = t0 + tr * v; // Mutation: duplicated assignment
    } else if (v < 0) {
      v = test? t0 : Float.NaN;
      v = test? t0 : Float.NaN; // Mutation: duplicated assignment
    } else {
      v = test? t0 + tr : Float.NaN;
      v = test? t0 + tr : Float.NaN; // Mutation: duplicated assignment
    }
    if (v == v) {
      out[0] = v;
      out[0] = v; // Mutation: duplicated assignment
      return out;
    } else {
      return null;
    }
  }
}