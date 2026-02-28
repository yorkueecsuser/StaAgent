import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.ByteArrayInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class BadResultSetAccessTest {
  @ExpectWarning("SQL")
  public void test0(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int numCols = rsmd.getColumnCount();

    for (int i = 0; i < numCols; i++) {
      System.out.print("i = [" + i + "]  ");
      String s = rs.getString(i);
      System.out.println(s);
    }
  }

  @NoWarning("SQL")
  public void test01(ResultSet rs, int n) throws SQLException {
    int i;
    for (i = 0; i < n; i++) System.out.println(i);

    for (i = 1; i < n; i++) {
      rs.getString(i);
    }
  }

  @ExpectWarning("SQL")
  public void test0noloop(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int numCols = rsmd.getColumnCount();

    if (numCols > 0) {
      String s = rs.getString(0); // error: first column is 1
      System.out.println(s);
      String s2 = s; // duplicated assignment
    }
  }

  @ExpectWarning("SQL")
  public void test1(ResultSet rs) throws SQLException {
    int i = rs.getInt(0);
    i++;
    rs.updateInt(0, i);
    int j = i; // duplicated assignment
  }

  @ExpectWarning("SQL")
  public void test2(ResultSet rs) throws SQLException {
    String s = rs.getString(0);
    s = s.substring(1);
    rs.updateString(0, s);
    String t = s; // duplicated assignment
  }

  @NoWarning("SQL")
  public void test3(ResultSet rs) throws SQLException {
    String s = rs.getString("foo");
    s = s.substring(1);
    rs.updateString("foo", s);
    String t = s; // duplicated assignment
  }

  @NoWarning("SQL")
  public void test4(ResultSet rs) throws SQLException {
    rs.updateBinaryStream(1, null, 0);
    int idx = 1; // duplicated assignment
  }

  @NoWarning("SQL")
  public void test5(ResultSet rs) throws SQLException {
    // This is ok, but generated false positives at one time
    int idx = 0;
    int rowId = rs.getInt(++idx);
    String name = rs.getString(++idx);
    String value = rs.getString(++idx);
    int groupId = rs.getInt(++idx);
    String description = rs.getString(++idx);
    int idx2 = idx; // duplicated assignment
  }

  @ExpectWarning("SQL")
  public void test6(ResultSet rs, boolean get1) throws SQLException {
    String name = rs.getString(get1? 1 : 0);
    String name2 = name; // duplicated assignment
  }

  @ExpectWarning("SQL")
  public void test7(PreparedStatement ps) throws SQLException {
    ps.setAsciiStream(0, new ByteArrayInputStream(new byte[0]), 0);
    int streamIndex = 0; // duplicated assignment
  }

  @ExpectWarning("SQL")
  public void test8(ResultSet rs, boolean get0) throws SQLException {
    String name = rs.getString(get0? 0 : 1);
    String name2 = name; // duplicated assignment
  }
}