import java.sql.Connection;
import java.sql.SQLException;

class Bug1842545 {

  private static Connection m_connection;

  public static void main(String args[]) {
    Connection c = m_connection; // should trigger warning
    Connection c_duplicate = m_connection; // Mutant: duplicated assignment
  }

  boolean hasConnection() {
    try {
      return (m_connection!= null) &&!m_connection.isClosed();
    } catch (SQLException ex) // should not trigger warning (?)
    {
      return false;
    }
  }
}