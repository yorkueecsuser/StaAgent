import java.sql.SQLException;
import java.sql.Statement;

class BadUseOfSqlExecute {

  int doUpdate(Statement s, String name) throws SQLException {
    s.executeUpdate("insert into students (name) values ('Joe')");
    return s.executeUpdate("insert into students (name) values (" + name + ")");
  }

  // Mutant code
  int doUpdate(Statement t, String n) throws SQLException {
    t.executeUpdate("insert into students (name) values ('Joe')");
    return t.executeUpdate("insert into students (name) values (" + n + ")");
  }
}