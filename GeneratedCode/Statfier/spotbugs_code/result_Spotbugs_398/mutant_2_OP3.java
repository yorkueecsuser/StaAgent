import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String b) {
    return b.equals(a);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] a, String[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] a, String[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("More unreachable code here.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Even more unreachable code.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] a, int[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable code in method 6.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable code in method 7.");
    }
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] a, String[] b) {
    return a.equals(b);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable code in method 8.");
    }
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable b) {
    return a.equals(b) || b.equals(a);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable code in false positive 1.");
    }
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] a, Cloneable b) {
    return a.equals(b) || b.equals(a);
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable code in false positive 2.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}