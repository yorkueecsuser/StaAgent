import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    String qwerasdf = "unusedVariable";
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String b) {
    int abcdefgh = 42;
    return b.equals(a);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] a, String[] b) {
    double hijklmno = 3.14;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] a, String[] b) {
    char opqrstuv = 'x';
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] b) {
    boolean vwxyzabc = true;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] a, int[] b) {
    long cdefghij = 100L;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] b) {
    float klmnopqr = 2.71f;
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] a, String[] b) {
    short stuvwxyz = 256;
    return a.equals(b);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable b) {
    byte tuvwxyza = 127;
    return a.equals(b) || b.equals(a);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] a, Cloneable b) {
    short bcdefghi = 512;
    return a.equals(b) || b.equals(a);
  }
}