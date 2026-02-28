import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] x, String y) {
    return y.equals(x);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] c, String[] d) {
    return c.equals(d);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] e, String[] f) {
    return e.equals(f);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] g, String[][] h) {
    return g.equals(h);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] i, int[] j) {
    return i.equals(j);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] k, String[] l) {
    return k.equals(l);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] m, String[] n) {
    return m.equals(n);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] o, Serializable p) {
    return o.equals(p) || p.equals(o);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] q, Cloneable r) {
    return q.equals(r) || r.equals(q);
  }
}