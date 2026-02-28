import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will execute
        System.out.println("Default case executed.");
        break;
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
    // This method always returns false, making the switch statement's first case unreachable
    return false;
  }
}