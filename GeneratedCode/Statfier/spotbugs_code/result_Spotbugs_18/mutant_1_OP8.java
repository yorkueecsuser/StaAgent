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
    Connection xnn;
    PreparedStatement qstm = null;
    try {
      xnn = DriverManager.getConnection(url);
      qstm = xnn.prepareStatement("123");
      qstm.executeUpdate();
    } finally {
      if (qstm!= null) qstm.close();
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
    Connection ynn;
    PreparedStatement rstm = null;
    try {
      ynn = getConnection();
      rstm = ynn.prepareStatement("123");
      rstm.executeUpdate();
    } finally {
      if (rstm!= null) rstm.close();
    }
  }
}