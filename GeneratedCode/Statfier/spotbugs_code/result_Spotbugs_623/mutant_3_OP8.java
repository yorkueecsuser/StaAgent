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

    // Mutated code
    PreparedStatement a =
        c.prepareStatement(
            "UPDATE  findbugs_issue SET bugDatabaseKey =?, firstSeen =? WHERE id =?");
    int b = 1;
    a.setString(b++, key);
    a.setTimestamp(b++, when);
    a.setInt(b++, id);
    // missing execute
    a.close();
  }
}