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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("This will never be printed");
            break;
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

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("This will never be printed");
            break;
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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This will never be printed");
          break;
    }
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This will never be printed");
          break;
    }
  }

  private Connection getConnection() {
    return null;
  }

  private boolean getCondition() {
    return false;
  }
}