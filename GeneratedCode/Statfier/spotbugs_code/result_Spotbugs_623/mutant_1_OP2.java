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
    insertBugData.setString(col++, key); // Duplicate assignment statement
    insertBugData.setTimestamp(col++, when);
    insertBugData.setTimestamp(col++, when); // Duplicate assignment statement
    insertBugData.setInt(col++, id);
    insertBugData.setInt(col++, id); // Duplicate assignment statement
    // missing execute
    insertBugData.close();
  }
}