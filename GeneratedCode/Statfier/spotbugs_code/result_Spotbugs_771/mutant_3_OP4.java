import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean shouldRun = getCondition(); // Ensure the condition is dynamically determined
    if (shouldRun) {
      // This block will never execute because shouldRun is false
    } else {
      // This block will also never execute because shouldRun is false
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
    return false; // This method returns false, ensuring the if-else branches are unreachable
  }
}