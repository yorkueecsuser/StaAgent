import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long x = 1; // Mutated variable name from serialVersionUID to x
    static long serialVersionUID = 1; // Original variable retained
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long y = 2; // Mutated variable name from serialVersionUID to y
    final long serialVersionUID = 2; // Original variable retained
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int z = 3; // Mutated variable name from serialVersionUID to z
    static final int serialVersionUID = 3; // Original variable retained
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long w = 4; // Mutated variable name from serialVersionUID to w
    static final long serialVersionUID = 4; // Original variable retained
  }
}