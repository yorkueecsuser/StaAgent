import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;
    static long serialVersionUIDDuplicate = 1; // Duplicate of the original assignment
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;
    final long serialVersionUIDDuplicate = 2; // Duplicate of the original assignment
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;
    static final int serialVersionUIDDuplicate = 3; // Duplicate of the original assignment
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;
    static final long serialVersionUIDDuplicate = 4; // Duplicate of the original assignment
  }
}