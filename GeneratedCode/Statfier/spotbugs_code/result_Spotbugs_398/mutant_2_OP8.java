import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] x, String b) {
    return b.equals(x);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] y, String[] b) {
    return y.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] z, String[] b) {
    return z.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] c) {
    return a.equals(c);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] d, int[] b) {
    return d.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] e, String[] b) {
    return e.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] f, String[] b) {
    return f.equals(b);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] g, Serializable b) {
    return g.equals(b) || b.equals(g);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] h, Cloneable b) {
    return h.equals(b) || b.equals(h);
  }
}