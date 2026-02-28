import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class BadSerial {
  static class NotFinal implements Serializable {
    @ExpectWarning("Se")
    static long serialVersionUID = 1;
    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
  }

  static class NotStatic implements Serializable {
    @ExpectWarning("SS")
    final long serialVersionUID = 2;
    // Dead Store Mutation
    int xwvfldmj = 42;
  }

  static class NotLong implements Serializable {
    @DesireWarning("Se")
    static final int serialVersionUID = 3;
    // Dead Store Mutation
    boolean jkqponml = true;
  }

  static class Good implements Serializable {
    @NoWarning("Se")
    static final long serialVersionUID = 4;
    // Dead Store Mutation
    double zxcvbnmr = 3.14;
  }
}