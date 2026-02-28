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

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop.");
    }

    insertBugData.close();
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}