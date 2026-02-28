import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This loop is unreachable");
    }

    s.executeUpdate("insert into students (name) values ('Joe')");
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}