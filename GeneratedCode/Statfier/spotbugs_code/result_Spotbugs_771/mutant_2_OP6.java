import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false
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
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}