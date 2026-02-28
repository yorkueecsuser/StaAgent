import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;

    // Mutant code added here
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;

    // Mutant code added here
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;

    // Mutant code added here
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;

    // Mutant code added here
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This ensures the if branch is reachable and else is unreachable
  }
}