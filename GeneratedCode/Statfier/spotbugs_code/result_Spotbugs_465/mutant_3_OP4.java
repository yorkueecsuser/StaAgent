import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;

    // Mutant code: Inserting an unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }

    private boolean getCondition() {
      return true; // This ensures the condition is always true, making the else block unreachable
    }
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;

    // Mutant code: Inserting an unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }

    private boolean getCondition() {
      return true; // This ensures the condition is always true, making the else block unreachable
    }
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;

    // Mutant code: Inserting an unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }

    private boolean getCondition() {
      return true; // This ensures the condition is always true, making the else block unreachable
    }
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;

    // Mutant code: Inserting an unreachable if-else statement
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }

    private boolean getCondition() {
      return true; // This ensures the condition is always true, making the else block unreachable
    }
  }
}