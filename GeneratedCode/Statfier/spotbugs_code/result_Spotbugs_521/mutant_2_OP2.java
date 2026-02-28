import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    s.executeUpdate("insert into students (name) values ('Joe')"); // Duplicate of the original statement
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }
}