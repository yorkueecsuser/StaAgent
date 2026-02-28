import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
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
    return false; // This method ensures the switch condition is always false
  }
}