import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    
    // Introduced an unreachable if statement according to the mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      s.executeUpdate("insert into students (name) values ('Unreachable')");
    }
    
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}