import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] x, String b) {
    return x.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String y) {
    return y.equals(a);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] c, String[] b) {
    return c.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] d, String[] b) {
    return d.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] e) {
    return a.equals(e);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] f, int[] b) {
    return f.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] g) {
    return a.equals(g);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] h, String[] b) {
    return h.equals(b);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable i) {
    return a.equals(i) || i.equals(a);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] j, Cloneable b) {
    return j.equals(b) || b.equals(j);
  }
}