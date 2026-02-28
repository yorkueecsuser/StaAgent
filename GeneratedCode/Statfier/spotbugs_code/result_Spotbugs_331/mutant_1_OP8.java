import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Bug1629176 {
  private static final String INSERT_FIELD_AUDIT = "foo";

  void f() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    PreparedStatement x = null; // Mutant variable

    try {
      for (int i = 1; i <= 10; i++) {
        insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
        insertFieldAudit.executeUpdate();
        x = getConnection().prepareStatement(INSERT_FIELD_AUDIT); // Mutant usage
        x.executeUpdate(); // Mutant usage
      }
    } finally {
      insertFieldAudit.close();
      x.close(); // Mutant closure
    }
  }

  void f2() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    PreparedStatement y = null; // Mutant variable

    try {
      insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      insertFieldAudit.executeUpdate();
      y = getConnection().prepareStatement(INSERT_FIELD_AUDIT); // Mutant usage
      y.executeUpdate(); // Mutant usage
    } finally {
      insertFieldAudit.close();
      y.close(); // Mutant closure
    }
  }

  void f3() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    PreparedStatement z = null; // Mutant variable

    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    z = getConnection().prepareStatement(INSERT_FIELD_AUDIT); // Mutant usage
    z.executeUpdate(); // Mutant usage
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    PreparedStatement w = getConnection().prepareStatement(INSERT_FIELD_AUDIT); // Mutant variable
    insertFieldAudit.executeUpdate();
    w.executeUpdate(); // Mutant usage
  }

  private Connection getConnection() {
    return null;
  }
}