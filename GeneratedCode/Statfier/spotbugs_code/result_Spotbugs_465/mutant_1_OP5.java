import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;

    // Inserting an unreachable switch statement
    public void someMethod() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;

    // Inserting an unreachable switch statement
    public void someMethod() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;

    // Inserting an unreachable switch statement
    public void someMethod() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;

    // Inserting an unreachable switch statement
    public void someMethod() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}