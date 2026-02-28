import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
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
    return false; // This method will always return false, making the if statement unreachable
  }
}