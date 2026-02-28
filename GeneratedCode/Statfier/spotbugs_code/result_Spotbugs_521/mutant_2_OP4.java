import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      s.executeUpdate("insert into students (name) values ('Unreachable')");
    } else {
      s.executeUpdate("insert into students (name) values ('AlsoUnreachable')");
    }

    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the if-else branch is unreachable at runtime
  }
}