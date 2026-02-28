import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Bug1629176 {
  private static final String INSERT_FIELD_AUDIT = "foo";

  void f() throws SQLException {
    PreparedStatement insertFieldAudit = null;

    try {
      for (int i = 1; i <= 10; i++) {
        insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
        insertFieldAudit.executeUpdate();
      }
    } finally {
      insertFieldAudit.close();
    }

    // Mutant code
    PreparedStatement a = null;
    try {
      for (int i = 1; i <= 10; i++) {
        a = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
        a.executeUpdate();
      }
    } finally {
      a.close();
    }
  }

  void f2() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    try {
      insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      insertFieldAudit.executeUpdate();
      insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      insertFieldAudit.executeUpdate();
    } finally {
      insertFieldAudit.close();
    }

    // Mutant code
    PreparedStatement b = null;
    try {
      b = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      b.executeUpdate();
      b = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      b.executeUpdate();
    } finally {
      b.close();
    }
  }

  void f3() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();

    // Mutant code
    PreparedStatement c = null;
    c = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    c.executeUpdate();
    c = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    c.executeUpdate();
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();

    // Mutant code
    PreparedStatement d = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    d.executeUpdate();
  }

  private Connection getConnection() {
    return null;
  }
}