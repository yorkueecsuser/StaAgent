import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class demonstrates a false positive in Findbugs 1.1.0. If a CallableStatement is created
 * (with prepareCall()) and then closed in the finally block, all is well. If, however, the
 * CallableStatement is cast to a subclass of CallableStatement, then Findbugs reports: M B ODR:
 * joe.FindBugsTest.doit() may fail to close database resource At Bug1578378.java:[line 35]
 *
 * <p>In this particular test, the "stmt" variable exhibits proper behavior, whereas "stmt2" does
 * not.
 *
 * <p>dan.rabe@oracle.com October 16,2006
 */
class Bug1578378 {
  public abstract static class MyCallableStatement implements CallableStatement {}

  public void doit() {
    Connection conn = null;
    CallableStatement stmt = null;
    MyCallableStatement stmt2 = null;
    try {
      conn = DriverManager.getConnection("url", "user", "password");
      stmt = conn.prepareCall("xxx");
      stmt2 = (MyCallableStatement) conn.prepareCall("xxx");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (stmt!= null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt2!= null) {
        try {
          stmt2.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (conn!= null) {
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }

    // Mutated code
    Connection connb = null;
    CallableStatement stma = null;
    MyCallableStatement stmtc = null;
    try {
      connb = DriverManager.getConnection("url", "user", "password");
      stma = connb.prepareCall("xxx");
      stmtc = (MyCallableStatement) connb.prepareCall("xxx");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (stma!= null) {
        try {
          stma.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmtc!= null) {
        try {
          stmtc.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (connb!= null) {
        try {
          connb.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}