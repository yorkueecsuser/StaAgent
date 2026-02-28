import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Bug3506138 {

  public static Connection getConnection() {
    throw new UnsupportedOperationException();
  }

  @ExpectWarning("ODR_OPEN_DATABASE_RESOURCE")
  public static void test0(String url) throws Exception {
    Connection conn;
    PreparedStatement pstm = null;
    try {
      conn = DriverManager.getConnection(url);
      pstm = conn.prepareStatement("123");
      pstm.executeUpdate();
    } finally {
      if (pstm!= null) pstm.close();
    }

    // Mutant code
    Connection conx;
    PreparedStatement pstq = null;
    try {
      conx = DriverManager.getConnection(url);
      pstq = conx.prepareStatement("123");
      pstq.executeUpdate();
    } finally {
      if (pstq!= null) pstq.close();
    }
  }

  @DesireWarning("ODR_OPEN_DATABASE_RESOURCE")
  public static void test1() throws Exception {
    Connection conn;
    PreparedStatement pstm = null;
    try {
      conn = getConnection();
      pstm = conn.prepareStatement("123");
      pstm.executeUpdate();
    } finally {
      if (pstm!= null) pstm.close();
    }

    // Mutant code
    Connection cony;
    PreparedStatement pstz = null;
    try {
      cony = getConnection();
      pstz = cony.prepareStatement("123");
      pstz.executeUpdate();
    } finally {
      if (pstz!= null) pstz.close();
    }
  }
}