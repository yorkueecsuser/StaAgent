import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        System.out.println("This is an unreachable case.");
        break;
    }
    
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}