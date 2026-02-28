import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;
    
    // Mutant
    static long a = 1;
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;
    
    // Mutant
    final long b = 2;
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;
    
    // Mutant
    static final int c = 3;
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;
    
    // Mutant
    static final long d = 4;
  }
}