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
    PreparedStatement x = null;
    try {
      for (int j = 1; j <= 10; j++) {
        x = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
        x.executeUpdate();
      }
    } finally {
      x.close();
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
    PreparedStatement y = null;
    try {
      y = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      y.executeUpdate();
      y = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      y.executeUpdate();
    } finally {
      y.close();
    }
  }

  void f3() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();

    // Mutant code
    PreparedStatement z = null;
    z = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    z.executeUpdate();
    z = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    z.executeUpdate();
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();

    // Mutant code
    PreparedStatement w = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    w.executeUpdate();
  }

  private Connection getConnection() {
    return null;
  }
}