import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    return z;
  }

  // Mutated code
  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long g(boolean c, Long a, long w) {
    Long v = c? a : w;
    return v;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long h(boolean d, Long q, long r) {
    Long p = d? r : q;
    return p;
  }
}