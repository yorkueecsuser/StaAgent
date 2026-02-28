import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean condition = getCondition(); // Ensuring the if statement is not a compile-time constant
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable if statement");
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

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}