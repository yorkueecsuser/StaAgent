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
      // Unreachable while loop mutant
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } finally {
      insertFieldAudit.close();
    }
  }

  void f2() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    try {
      insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      insertFieldAudit.executeUpdate();
      insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
      insertFieldAudit.executeUpdate();
      // Unreachable while loop mutant
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    } finally {
      insertFieldAudit.close();
    }
  }

  void f3() throws SQLException {
    PreparedStatement insertFieldAudit = null;
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  private Connection getConnection() {
    return null;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}