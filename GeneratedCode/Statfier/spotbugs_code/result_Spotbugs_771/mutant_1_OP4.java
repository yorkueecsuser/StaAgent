import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should also never execute
      System.out.println("This is an unreachable else block");
    }
  }

  boolean hasConnection() {
    try {
      return (m_connection!= null) &&!m_connection.isClosed();
    } catch (SQLException ex) // should not trigger warning (?)
    {
      return false;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}