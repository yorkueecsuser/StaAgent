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

    // Mutant: Rename 'numCols' to 'x'
    int x = rsmd.getColumnCount();
    for (int j = 0; j < x; j++) {
      System.out.print("j = [" + j + "]  ");
      String t = rs.getString(j);
      System.out.println(t);
    }
  }

  @NoWarning("SQL")
  public void test01(ResultSet rs, int n) throws SQLException {
    int i;
    for (i = 0; i < n; i++) System.out.println(i);

    for (i = 1; i < n; i++) {
      rs.getString(i);
    }

    // Mutant: Rename 'n' to 'y'
    int y = n;
    for (int z = 1; z < y; z++) {
      rs.getString(z);
    }
  }

  @ExpectWarning("SQL")
  public void test0noloop(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int numCols = rsmd.getColumnCount();

    if (numCols > 0) {
      String s = rs.getString(0); // error: first column is 1
      System.out.println(s);
    }

    // Mutant: Rename 'numCols' to 'a'
    int a = rsmd.getColumnCount();
    if (a > 0) {
      String b = rs.getString(0);
      System.out.println(b);
    }
  }

  @ExpectWarning("SQL")
  public void test1(ResultSet rs) throws SQLException {
    int i = rs.getInt(0);
    i++;
    rs.updateInt(0, i);

    // Mutant: Rename 'i' to 'c'
    int c = rs.getInt(0);
    c++;
    rs.updateInt(0, c);
  }

  @ExpectWarning("SQL")
  public void test2(ResultSet rs) throws SQLException {
    String s = rs.getString(0);
    s = s.substring(1);
    rs.updateString(0, s);

    // Mutant: Rename's' to 'd'
    String d = rs.getString(0);
    d = d.substring(1);
    rs.updateString(0, d);
  }

  @NoWarning("SQL")
  public void test3(ResultSet rs) throws SQLException {
    String s = rs.getString("foo");
    s = s.substring(1);
    rs.updateString("foo", s);

    // Mutant: Rename's' to 'e'
    String e = rs.getString("foo");
    e = e.substring(1);
    rs.updateString("foo", e);
  }

  @NoWarning("SQL")
  public void test4(ResultSet rs) throws SQLException {
    rs.updateBinaryStream(1, null, 0);

    // Mutant: Rename 'rs' to 'f'
    ResultSet f = rs;
    f.updateBinaryStream(1, null, 0);
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

    // Mutant: Rename 'idx' to 'g'
    int g = 0;
    int rowId2 = rs.getInt(++g);
    String name2 = rs.getString(++g);
    String value2 = rs.getString(++g);
    int groupId2 = rs.getInt(++g);
    String description2 = rs.getString(++g);
  }

  @ExpectWarning("SQL")
  public void test6(ResultSet rs, boolean get1) throws SQLException {
    String name = rs.getString(get1? 1 : 0);

    // Mutant: Rename 'name' to 'h'
    String h = rs.getString(get1? 1 : 0);
  }

  @ExpectWarning("SQL")
  public void test7(PreparedStatement ps) throws SQLException {
    ps.setAsciiStream(0, new ByteArrayInputStream(new byte[0]), 0);

    // Mutant: Rename 'ps' to 'k'
    PreparedStatement k = ps;
    k.setAsciiStream(0, new ByteArrayInputStream(new byte[0]), 0);
  }

  @ExpectWarning("SQL")
  public void test8(ResultSet rs, boolean get0) throws SQLException {
    String name = rs.getString(get0? 0 : 1);

    // Mutant: Rename 'name' to 'l'
    String l = rs.getString(get0? 0 : 1);
  }
}