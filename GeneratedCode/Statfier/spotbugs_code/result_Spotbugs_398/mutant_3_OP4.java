import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class ArrayEquality {

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality(String[] a, String b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality2(String[] a, String b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return b.equals(a);
  }

  @ExpectWarning("EC_BAD_ARRAY_COMPARE")
  boolean reportProblemsWithArrayEquality3(String[] a, String[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality4(String[][] a, String[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality5(String[] a, String[][] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality6(String[] a, int[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality7(int[] a, String[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @ExpectWarning("EC")
  boolean reportProblemsWithArrayEquality8(StringBuffer[] a, String[] b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive1(String[] a, Serializable b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b) || b.equals(a);
  }

  @NoWarning("EC")
  boolean reportProblemsWithArrayEqualityFalsePositive2(String[] a, Cloneable b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.equals(b) || b.equals(a);
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on some logic, but for the purpose of this mutation, it returns false.
  }
}