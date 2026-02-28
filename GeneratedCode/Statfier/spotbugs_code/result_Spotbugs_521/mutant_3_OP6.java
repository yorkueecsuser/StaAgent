import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }

    s.executeUpdate("insert into students (name) values ('Joe')");
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  // Method to return a condition that makes the loop unreachable
  private boolean getCondition() {
    return false;
  }
}