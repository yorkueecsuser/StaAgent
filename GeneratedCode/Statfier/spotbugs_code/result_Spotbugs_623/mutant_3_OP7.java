import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

class Ideas_2009_04_21 {
  public void fileBug(Connection c, String key, Timestamp when, int id) throws Exception {

    PreparedStatement insertBugData =
        c.prepareStatement(
            "UPDATE  findbugs_issue SET bugDatabaseKey =?, firstSeen =? WHERE id =?");
    int col = 1;
    insertBugData.setString(col++, key);
    insertBugData.setTimestamp(col++, when);
    insertBugData.setInt(col++, id);
    // missing execute

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
    }

    insertBugData.close();
  }

  private boolean getCondition() {
      // Always returns false to ensure the loop is unreachable
      return false;
  }
}