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

  // Mutant 1: Renamed boolean parameter 'b' to 'a'
  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f_mutant1(boolean a, Long x, long y) {
    Long z = a? x : y;
    return z;
  }

  // Mutant 2: Renamed Long parameter 'x' to'm'
  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2_mutant2(boolean b, Long m, long y) {
    Long z = b? y : m;
    return z;
  }
}