import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      s.executeUpdate("insert into students (name) values ('Unreachable')");
    }
    
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}