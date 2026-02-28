import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;

    // Introduced unreachable switch statement
    void someMethod() {
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }

    private int getValue(boolean condition) {
      if (condition) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;

    // Introduced unreachable switch statement
    void someMethod() {
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }

    private int getValue(boolean condition) {
      if (condition) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;

    // Introduced unreachable switch statement
    void someMethod() {
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }

    private int getValue(boolean condition) {
      if (condition) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;

    // Introduced unreachable switch statement
    void someMethod() {
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }

    private int getValue(boolean condition) {
      if (condition) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}