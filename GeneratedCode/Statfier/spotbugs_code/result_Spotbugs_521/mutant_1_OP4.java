import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      s.executeUpdate("insert into students (name) values ('Unreachable')");
    } else {
      // This block is always executed
      s.executeUpdate("insert into students (name) values ('Joe')");
      return s.executeUpdate("insert into students (name) values (" + name + ")");
    }
  }

  private boolean getCondition() {
    // Always return false to make the if block unreachable
    return false;
  }
}