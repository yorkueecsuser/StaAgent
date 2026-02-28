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
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block should never execute
          System.out.println("This is an unreachable if block in f()");
        } else {
          // This block should always execute
          System.out.println("This is the else block in f()");
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable if block in f2()");
      } else {
        // This block should always execute
        System.out.println("This is the else block in f2()");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block in f3()");
    } else {
      // This block should always execute
      System.out.println("This is the else block in f3()");
    }
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block in f4()");
    } else {
      // This block should always execute
      System.out.println("This is the else block in f4()");
    }
  }

  private Connection getConnection() {
    return null;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}