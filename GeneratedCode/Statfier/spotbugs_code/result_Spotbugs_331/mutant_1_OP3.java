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
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable statement in f()");
        }
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
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
          System.out.println("This is an unreachable statement in f2()");
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
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
        System.out.println("This is an unreachable statement in f3()");
    }
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
        System.out.println("This is an unreachable statement in f4()");
    }
  }

  private Connection getConnection() {
    return null;
  }

  private boolean getCondition() {
    return false;
  }
}