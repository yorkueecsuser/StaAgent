import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and set to false
      System.out.println("This is an unreachable loop");
    }

    s.executeUpdate("insert into students (name) values ('Joe')");
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}