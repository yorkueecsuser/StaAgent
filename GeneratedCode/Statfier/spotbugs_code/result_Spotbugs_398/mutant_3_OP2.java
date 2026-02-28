import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String b) {
    return b.equals(a);
    boolean result = b.equals(a); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] a, String[] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] a, String[] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] a, int[] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] a, String[] b) {
    return a.equals(b);
    boolean result = a.equals(b); // Mutant: Duplicate assignment
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable b) {
    return a.equals(b) || b.equals(a);
    boolean result = a.equals(b) || b.equals(a); // Mutant: Duplicate assignment
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] a, Cloneable b) {
    return a.equals(b) || b.equals(a);
    boolean result = a.equals(b) || b.equals(a); // Mutant: Duplicate assignment
  }
}