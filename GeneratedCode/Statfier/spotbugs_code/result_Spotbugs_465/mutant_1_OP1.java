import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;
    // Dead store mutation
    String qvbnrhty = "unused";
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;
    // Dead store mutation
    int jklmnpqr = 42;
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;
    // Dead store mutation
    boolean wxyzabcd = true;
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;
    // Dead store mutation
    double efghijkl = 3.14;
  }
}