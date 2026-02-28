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
        // Mutant addition
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because getCondition() returns false
          System.out.println("This is an unreachable block in f()");
        } else {
          // Alternative code that will always execute
          System.out.println("This is the alternative block in f()");
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
      // Mutant addition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable block in f2()");
      } else {
        // Alternative code that will always execute
        System.out.println("This is the alternative block in f2()");
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
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block in f3()");
    } else {
      // Alternative code that will always execute
      System.out.println("This is the alternative block in f3()");
    }
  }

  void f4() throws SQLException {
    PreparedStatement insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT);
    insertFieldAudit.executeUpdate();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block in f4()");
    } else {
      // Alternative code that will always execute
      System.out.println("This is the alternative block in f4()");
    }
  }

  private Connection getConnection() {
    return null;
  }

  private boolean getCondition() {
    return false;
  }
}