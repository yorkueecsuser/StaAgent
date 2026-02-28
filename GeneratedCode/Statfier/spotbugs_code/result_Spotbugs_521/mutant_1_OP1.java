import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    int abcdefgh = 42; // Dead store mutation
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }
}