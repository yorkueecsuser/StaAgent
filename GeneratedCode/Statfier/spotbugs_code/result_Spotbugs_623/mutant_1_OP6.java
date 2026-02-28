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
    insertBugData.close();

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}