import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable statement.");
    }
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("And yet another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}