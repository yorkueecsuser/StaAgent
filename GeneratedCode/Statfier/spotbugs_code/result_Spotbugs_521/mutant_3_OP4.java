import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      s.executeUpdate("insert into students (name) values ('Unreachable')");
    } else {
      // This block will always execute
      return s.executeUpdate("insert into students (name) values (" + name + ")");
    }
  }

  // Method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}