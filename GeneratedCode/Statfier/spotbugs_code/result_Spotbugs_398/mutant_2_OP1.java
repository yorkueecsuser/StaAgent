import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    String hgfjkdsl = "unusedVariable";
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String b) {
    int vbnrhtyu = 42;
    return b.equals(a);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] a, String[] b) {
    double qwerasdf = 3.14;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] a, String[] b) {
    char zxcvbnml = 'x';
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] b) {
    boolean poiuytrewq = true;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] a, int[] b) {
    float lkjhgfds = 2.71f;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] b) {
    long mnbvcxz = 987654321L;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] a, String[] b) {
    short asdfghjk = 123;
    return a.equals(b);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable b) {
    byte poiuyt = 10;
    return a.equals(b) || b.equals(a);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] a, Cloneable b) {
    String ijklmnop = "anotherUnusedVar";
    return a.equals(b) || b.equals(a);
  }
}